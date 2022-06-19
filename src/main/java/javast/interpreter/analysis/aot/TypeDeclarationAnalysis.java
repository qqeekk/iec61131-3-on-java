package javast.interpreter.analysis.aot;

import javast.interpreter.objects.library.AliasTypeDeclarationDto;
import javast.interpreter.objects.library.StructTypeDeclarationDto;
import javast.interpreter.objects.library.TypeDeclarationDto;
import javast.interpreter.objects.variables.AliasTypeVariableDto;
import javast.sablecc.analysis.DepthFirstAdapter;
import javast.sablecc.node.*;

public class TypeDeclarationAnalysis extends DepthFirstAdapter {
    private final String name;
    private final int blockNum;
    private VariableDeclarationAnalysis variableAnalysis;
    private TypeDeclarationDto declaration;

    public TypeDeclarationAnalysis(String name, int blockNum) {
        this.name = name;
        this.blockNum = blockNum;
        this.variableAnalysis = new VariableDeclarationAnalysis();

        // Setup variable analysis.
        var fictive = new AVar1List(null, new TIdentifier("initial"));
        variableAnalysis.caseAVar1List(fictive);
    }

    //    type_spec_init =
    //    {simple} simple_spec_init |
    //    {array_type} array_spec_init |
    //    {struct_type} structure_specification |
    //    {string_type} string_wstring_type_name brack_integer string_type_declaration_initialization?;

    @Override
    public void caseASimpleSpecInit(ASimpleSpecInit node) {
        variableAnalysis.caseASimpleSpecInit(node);
        var initial = !variableAnalysis.getDeclarations().empty()
            ? variableAnalysis.getDeclarations().peek() : null;

        declaration = new AliasTypeDeclarationDto(blockNum, name, initial);
    }

    @Override
    public void caseAArraySpecInit(AArraySpecInit node) {
        variableAnalysis.caseAArraySpecInit(node);
        var initial = !variableAnalysis.getDeclarations().empty()
            ? variableAnalysis.getDeclarations().pop() : null;

        declaration = new AliasTypeDeclarationDto(blockNum, name, initial);
    }

    @Override
    public void caseAInitializedStructure(AInitializedStructure node) {
        variableAnalysis.caseAInitializedStructure(node);

        var initial = !variableAnalysis.getDeclarations().empty()
            ? variableAnalysis.getDeclarations().pop() : null;

        declaration = new AliasTypeDeclarationDto(blockNum, name, initial);
    }

    @Override
    public void caseAStructureDeclaration(AStructureDeclaration node) {
        this.variableAnalysis = new VariableDeclarationAnalysis();
        super.caseAStructureDeclaration(node);

        declaration = new StructTypeDeclarationDto(
            blockNum, name, variableAnalysis.getDeclarations());
    }

    @Override
    public void caseAStructureElementDeclaration(AStructureElementDeclaration node) {
        var field = new AVar1List(null, new TIdentifier(node.getIdentifier().getText()));
        node.getStructureElementInit().apply(variableAnalysis);
    }

    public TypeDeclarationDto getDeclaration() {
        return declaration;
    }
}
