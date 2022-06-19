package javast.interpreter.analysis.aot;

import javast.interpreter.analysis.runtime.ExpressionAnalysis;
import javast.interpreter.objects.temp.UnknownTypeReferenceDto;
import javast.interpreter.objects.temp.UnknownTypeVariableDto;
import javast.interpreter.objects.types.*;
import javast.interpreter.objects.variables.*;
import javast.sablecc.analysis.DepthFirstAdapter;
import javast.sablecc.node.*;

import java.util.*;

public class VariableDeclarationAnalysis extends DepthFirstAdapter {
    private final Stack<VariableDto> declarations;
    private final Stack<String> identifiers;
    private final Stack<Map.Entry<Integer, Integer>> dimensions;
    private final Stack<PArrayInitialElements> arrayElements;

    public VariableDeclarationAnalysis() {
        declarations = new Stack<>();
        identifiers = new Stack<>();
        dimensions = new Stack<>();
        arrayElements = new Stack<>();
    }

    @Override
    public void caseAInitializedStructure(AInitializedStructure node) {
        var initialization = node.getInitializedStructureInitialization();

        var initialElement = initialization != null
            ? ((AInitializedStructureInitialization)initialization).getInitialElement()
            : null;

        var type = new UnknownTypeReferenceDto(node.getIdentifier().getText());
        do {
            var variableName = identifiers.pop();
            var variable = new UnknownTypeVariableDto(variableName, type, initialElement);
            declarations.add(variable);
        } while (!identifiers.empty());
    }

    @Override
    public void caseASimpleSpecInit(ASimpleSpecInit node) {
        var visitor = new VariableTypeAnalysis();
        node.getElementaryTypeName().apply(visitor);

        var initialization = node.getSimpleSpecInitialization();
        var constant = initialization != null
            ? ((ASimpleSpecInitialization)initialization).getConstant()
            : null;

        String str = null;
        if (constant instanceof ACharacterConstant constStr) {
            var expressionVisitor = new ExpressionAnalysis();
            constStr.apply(expressionVisitor);
            str = expressionVisitor.getValue().getAsString();
        }

        do {
            var variableName = identifiers.pop();
            if (visitor.getType() instanceof PrimitiveTypeReferenceDto type) {
                var variable = new PrimitiveTypeVariableDto(variableName, type, constant);
                declarations.add(variable);
            }
            else if (visitor.getType() instanceof StringTypeReferenceDto type) {
                var variable = new StringTypeVariableDto(variableName, type, str);
                declarations.add(variable);
            }
        } while (!identifiers.empty());
    }

    @Override
    public void caseAArraySpecInit(AArraySpecInit node) {
        // Get element type.
        var typeVisitor = new VariableTypeAnalysis();
        node.getNonGenericTypeName().apply(typeVisitor);
        var elementType = typeVisitor.getType();

        // Get dimensions.
        var dimensions = new ArrayList<Map.Entry<Integer, Integer>>();
        node.getSubrangeList().apply(this);
        do {
            var dimension = this.dimensions.pop();
            dimensions.add(dimension);
        } while (!this.dimensions.empty());

        // Get specification.
        var elements = new ArrayList<PArrayInitialElements>();
        if (node.getArraySpecInitialization() != null) {
            node.getArraySpecInitialization().apply(this);
            do {
                elements.add(this.arrayElements.pop());
            } while (!this.arrayElements.empty());
        }

        var type = new ArrayTypeReferenceDto(elementType, dimensions);
        do {
            var variableName = identifiers.pop();
            var variable = new ArrayTypeVariableDto(variableName, type, elements);
            declarations.add(variable);
        } while (!identifiers.empty());
    }

    @Override
    public void caseASingleByteStringSpec(ASingleByteStringSpec node) {
        var expressionVisitor = new ExpressionAnalysis();
        node.getBrackInteger().apply(expressionVisitor);

        // Get type.
        var size = expressionVisitor.getValue().getAsInt();
        var type = new StringTypeReferenceDto(false, (int)size);

        // Get initial value.
        String initial = null;
        if (node.getSingleByteStringSpecInitialization() != null) {
            node.getSingleByteStringSpecInitialization().apply(expressionVisitor);
            initial = expressionVisitor.getValue().getAsString();
        }

        do {
            var variableName = identifiers.pop();
            var variable = new StringTypeVariableDto(variableName, type, initial);
            declarations.add(variable);
        } while (!identifiers.empty());
    }

    @Override
    public void caseADoubleByteStringSpec(ADoubleByteStringSpec node) {
        var expressionVisitor = new ExpressionAnalysis();
        node.getBrackInteger().apply(expressionVisitor);

        // Get type.
        var size = expressionVisitor.getValue().getAsInt();
        var type = new StringTypeReferenceDto(true, (int)size);

        // Get initial value.
        String initial = null;
        if (node.getDoubleByteStringSpecInitialization() != null) {
            node.getDoubleByteStringSpecInitialization().apply(expressionVisitor);
            initial = expressionVisitor.getValue().getAsString();
        }

        do {
            var variableName = identifiers.pop();
            var variable = new StringTypeVariableDto(variableName, type, initial);
            declarations.add(variable);
        } while (!identifiers.empty());
    }

    @Override
    public void caseAVar1List(AVar1List node) {
        super.caseAVar1List(node);

        var last = node.getIdentifier().getText();
        identifiers.push(last);
    }

    @Override
    public void caseAVar1ListHead(AVar1ListHead node) {
        var variable = node.getIdentifier().getText();
        identifiers.push(variable);
    }

    @Override
    public void caseASubrangeList(ASubrangeList node) {
        super.caseASubrangeList(node);

        var expressionVisitor = new ExpressionAnalysis();
        expressionVisitor.caseTSubrange(node.getSubrange());
        var dimension = expressionVisitor.getValue().getAsIntArray();
        dimensions.push(Map.entry(dimension[0], dimension[1]));
    }

    @Override
    public void caseASubrangeListHead(ASubrangeListHead node) {
        var expressionVisitor = new ExpressionAnalysis();
        expressionVisitor.caseTSubrange(node.getSubrange());
        var dimension = expressionVisitor.getValue().getAsIntArray();
        dimensions.push(Map.entry(dimension[0], dimension[1]));
    }

    @Override
    public void caseAArrayInitialElementsList(AArrayInitialElementsList node) {
        super.caseAArrayInitialElementsList(node);
        arrayElements.push(node.getArrayInitialElements());
    }

    @Override
    public void caseAArrayInitialElementsListHead(AArrayInitialElementsListHead node){
        arrayElements.push(node.getArrayInitialElements());
    }

    public Stack<VariableDto> getDeclarations() {
        return declarations;
    }
}
