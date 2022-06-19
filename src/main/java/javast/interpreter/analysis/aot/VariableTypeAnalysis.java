package javast.interpreter.analysis.aot;

import javast.interpreter.objects.enums.PrimitiveType;
import javast.interpreter.objects.types.PrimitiveTypeReferenceDto;
import javast.interpreter.objects.types.StringTypeReferenceDto;
import javast.interpreter.objects.types.TypeReferenceDto;
import javast.sablecc.analysis.DepthFirstAdapter;
import javast.sablecc.node.*;

public class VariableTypeAnalysis extends DepthFirstAdapter {
    private TypeReferenceDto type;

    @Override
    public void caseAIntegerNumericTypeName(AIntegerNumericTypeName node) {
        var integer = node.getIntegerTypeName();
        var type = parsePrimitiveType(integer.getText());
        this.type = new PrimitiveTypeReferenceDto(type);
    }

    @Override
    public void caseARealNumericTypeName(ARealNumericTypeName node) {
        var integer = node.getRealTypeName();
        var type = parsePrimitiveType(integer.getText());
        this.type = new PrimitiveTypeReferenceDto(type);
    }

    @Override
    public void caseADateElementaryTypeName(ADateElementaryTypeName node) {
        var integer = node.getDateTypeName();
        var type = parsePrimitiveType(integer.getText());
        this.type = new PrimitiveTypeReferenceDto(type);
    }

    @Override
    public void caseABitStringElementaryTypeName(ABitStringElementaryTypeName node) {
        var integer = node.getBitStringTypeName();
        var type = parsePrimitiveType(integer.getText());
        this.type = new PrimitiveTypeReferenceDto(type);
    }

    @Override
    public void caseAStringElementaryTypeName(AStringElementaryTypeName node) {
        this.type = new StringTypeReferenceDto(false, null);
    }

    @Override
    public void caseAWstringElementaryTypeName(AWstringElementaryTypeName node) {
        this.type = new StringTypeReferenceDto(true, null);
    }

    @Override
    public void caseATimeElementaryTypeName(ATimeElementaryTypeName node) {
        var integer = node.getTimeTypeName();
        var type = parsePrimitiveType(integer.getText());
        this.type = new PrimitiveTypeReferenceDto(type);
    }

    private static PrimitiveType parsePrimitiveType(String name) {
        return PrimitiveType.valueOf(name);
    }

    public TypeReferenceDto getType() {
        return type;
    }
}
