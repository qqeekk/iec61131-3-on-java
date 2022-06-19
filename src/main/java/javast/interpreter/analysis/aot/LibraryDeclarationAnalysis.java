package javast.interpreter.analysis.aot;

import javast.interpreter.exceptions.InvalidSignatureException;
import javast.interpreter.objects.library.LibraryDeclarationDto;
import javast.interpreter.objects.enums.PouKind;
import javast.interpreter.objects.library.PouDeclarationDto;
import javast.interpreter.objects.library.TypeDeclarationDto;
import javast.sablecc.analysis.DepthFirstAdapter;
import javast.sablecc.node.*;

import java.util.*;

public class LibraryDeclarationAnalysis extends DepthFirstAdapter {
    public LibraryDeclarationDto getLib() {
        return lib;
    }

    private final LibraryDeclarationDto lib;
    private int typeBlockCnt = 0;

    public LibraryDeclarationAnalysis() {
        // TODO: populate with defaults
        this.lib = new LibraryDeclarationDto(
            new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>());
    }

    @Override
    public void caseAProgramDeclaration(AProgramDeclaration node) {
        final var idName = node.getIdentifier();
        final var name = idName.getText();

        if (lib.programs().containsKey(name)) {
            throw new InvalidSignatureException("Program with name %s already exists.".formatted(name), idName);
        }
        else {
            var pou = new PouDeclarationDto(PouKind.PROGRAM, name, null);
            new PouDeclarationAnalysis(pou).caseAProgramDeclaration(node);
            lib.programs().put(name, pou);
        }
    }

    @Override
    public void caseAFunctionDeclaration(AFunctionDeclaration node) {
        final var idName = node.getIdentifier();
        final var name = idName.getText();

        if (lib.isRegistered(name)) {
            throw new InvalidSignatureException("POU or type with name %s already exists.".formatted(name), idName);
        }
        else {
            var typeVisitor = new VariableTypeAnalysis();
            node.apply(typeVisitor);

            var pou = new PouDeclarationDto(PouKind.FUNCTION, name, typeVisitor.getType());
            new PouDeclarationAnalysis(pou).caseAFunctionDeclaration(node);
            lib.functions().put(name, pou);
        }
    }

    @Override
    public void caseAFunctionBlockDeclaration(AFunctionBlockDeclaration node) {
        final var idName = node.getIdentifier();
        final var name = idName.getText();

        if (lib.isRegistered(name)) {
            throw new InvalidSignatureException("POU or type with name %s already exists.".formatted(name), idName);
        }
        else {
            var typeVisitor = new VariableTypeAnalysis();
            node.apply(typeVisitor);

            var pou = new PouDeclarationDto(PouKind.FUNCTION_BLOCK, name, typeVisitor.getType());
            new PouDeclarationAnalysis(pou).caseAFunctionBlockDeclaration(node);
            lib.functionBlocks().put(name, pou);
        }
    }

    @Override
    public void caseADataTypeDeclaration(ADataTypeDeclaration node) {
        typeBlockCnt++;
        super.caseADataTypeDeclaration(node);
    }

    @Override
    public void caseADataTypeDeclarationElement(ADataTypeDeclarationElement node) {
        final var idName = node.getIdentifier();
        final var name = idName.getText();

        if (lib.isRegistered(name)) {
            throw new InvalidSignatureException("POU or type with name %s already exists.".formatted(name), idName);
        }
        else {
            var typeAnalysis = new TypeDeclarationAnalysis(name, typeBlockCnt);
            typeAnalysis.caseADataTypeDeclarationElement(node);
            lib.types().put(name, typeAnalysis.getDeclaration());
        }
    }
}
