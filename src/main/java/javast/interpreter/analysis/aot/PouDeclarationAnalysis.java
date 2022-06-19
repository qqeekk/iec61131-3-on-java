package javast.interpreter.analysis.aot;

import javast.interpreter.objects.library.PouDeclarationDto;
import javast.sablecc.analysis.DepthFirstAdapter;
import javast.sablecc.node.*;

public class PouDeclarationAnalysis extends DepthFirstAdapter {
    private final PouDeclarationDto pou;

    public PouDeclarationAnalysis(PouDeclarationDto pou) {
        this.pou = pou;
    }

    @Override
    public void caseAInputDeclarations(AInputDeclarations node) {
        var variableAnalysis = new VariableDeclarationAnalysis();
        node.apply(variableAnalysis);
        pou.inputs().addAll(variableAnalysis.getDeclarations());
    }

    @Override
    public void caseAOutputDeclarations(AOutputDeclarations node) {
        var variableAnalysis = new VariableDeclarationAnalysis();
        node.apply(variableAnalysis);
        pou.outputs().addAll(variableAnalysis.getDeclarations());
    }

    @Override
    public void caseAInputOutputDeclarations(AInputOutputDeclarations node) {
        var variableAnalysis = new VariableDeclarationAnalysis();
        node.apply(variableAnalysis);
        pou.io().addAll(variableAnalysis.getDeclarations());
    }

    @Override
    public void caseAVarDeclarations(AVarDeclarations node) {
        var variableAnalysis = new VariableDeclarationAnalysis();
        node.apply(variableAnalysis);
        pou.locals().addAll(variableAnalysis.getDeclarations());
    }

    @Override
    public void caseAExternalVarDeclarations(AExternalVarDeclarations node) {
        var variableAnalysis = new VariableDeclarationAnalysis();
        node.apply(variableAnalysis);
        pou.externals().addAll(variableAnalysis.getDeclarations());
    }

    @Override
    public void caseATempVarDeclarations(ATempVarDeclarations node) {
        var variableAnalysis = new VariableDeclarationAnalysis();
        node.apply(variableAnalysis);
        pou.temps().addAll(variableAnalysis.getDeclarations());
    }

    @Override
    public void caseAStatementListHead(AStatementListHead node) {
        if (node.getStatement() != null) {
            pou.body().add(node.getStatement());
        }
    }
}
