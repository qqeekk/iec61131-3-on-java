package javast.interpreter.objects.types;

import javast.interpreter.objects.enums.TypeReferenceKind;

public class StringTypeReferenceDto extends TypeReferenceDto {
    private final boolean isDouble;
    private final Integer len;

    public StringTypeReferenceDto(boolean isDouble, Integer len) {
        this.isDouble = isDouble;
        this.len = len;
    }

    @Override
    public TypeReferenceKind getType() {
        return TypeReferenceKind.STRING;
    }

    public boolean isDouble() {
        return isDouble;
    }

    public Integer getLength() {
        return len;
    }

}

