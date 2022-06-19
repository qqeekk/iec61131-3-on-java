package javast.interpreter.analysis.runtime;

import javast.interpreter.objects.values.StObject;
import javast.sablecc.analysis.DepthFirstAdapter;
import javast.sablecc.node.*;

import java.util.regex.Pattern;

public class ExpressionAnalysis extends DepthFirstAdapter {
    private StObject value;
    private static Pattern intPattern;
    private static Pattern subrangePattern;

    static {
        intPattern = Pattern.compile("\\d+");
        subrangePattern = Pattern.compile("(?<start>\\d+)\\.\\.(?<end>\\d+)");
    }

    @Override
    public void caseACharacterConstant(ACharacterConstant node) {
        if (node.getCharacterString() != null) {
            node.getCharacterString().apply(this);
        }
        else {
            this.value = new StObject("", String.class);
        }
    }

    @Override
    public void caseASingleCharacterString(ASingleCharacterString node) {
        var value = node.getSingleByteCharacterString();
        this.value = new StObject(value.getText(), String.class);
    }

    @Override
    public void caseADoubleCharacterString(ADoubleCharacterString node) {
        var value = node.getDoubleByteCharacterString();
        this.value = new StObject(value.getText(), String.class);
    }

    @Override
    public void caseTSingleByteCharacterString(TSingleByteCharacterString node) {
        this.value = new StObject(node.getText(), String.class);
    }

    @Override
    public void caseTDoubleByteCharacterString(TDoubleByteCharacterString node) {
        this.value = new StObject(node.getText(), String.class);
    }

    @Override
    public void caseTSubrange(TSubrange subrange) {
        var clearedRange = subrange.getText().replace("_", "");
        var matcher = subrangePattern.matcher(clearedRange);

        if (matcher.find()) {
            var start = Integer.parseInt(matcher.group("start"));
            var end = Integer.parseInt(matcher.group("end"));
            this.value = new StObject(new int[]{start, end}, int[].class);
        }
    }

    @Override
    public void caseTIntegerLiteral(TIntegerLiteral node) {
        var cleared = node.getText().replace("_", "");
        var value = Long.parseLong(cleared);

        this.value = new StObject(value, Long.class);
    }

    public StObject getValue() {
        return value;
    }
}
