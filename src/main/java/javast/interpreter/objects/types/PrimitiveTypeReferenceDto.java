package javast.interpreter.objects.types;

import javast.interpreter.objects.enums.PrimitiveType;
import javast.interpreter.objects.enums.TypeReferenceKind;

public class PrimitiveTypeReferenceDto extends TypeReferenceDto {

    private final PrimitiveType type;

    public PrimitiveTypeReferenceDto(PrimitiveType type) {
        this.type = type;
    }

    public PrimitiveType getPrimitiveType() {
        return type;
    }

    @Override
    public TypeReferenceKind getType() {
        return TypeReferenceKind.PRIMITIVE;
    }
}
