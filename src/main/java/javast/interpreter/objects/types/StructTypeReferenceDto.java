package javast.interpreter.objects.types;

import javast.interpreter.objects.enums.TypeReferenceKind;

public class StructTypeReferenceDto extends TypeReferenceDto {

    private final String name;

    public StructTypeReferenceDto(String name) {
        this.name = name;
    }

    @Override
    public TypeReferenceKind getType() {
        return TypeReferenceKind.STRUCT;
    }

    public String getName() {
        return name;
    }
}

