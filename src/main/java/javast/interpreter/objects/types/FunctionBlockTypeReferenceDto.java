package javast.interpreter.objects.types;

import javast.interpreter.objects.enums.TypeReferenceKind;

public class FunctionBlockTypeReferenceDto extends TypeReferenceDto {

    private final String name;

    public FunctionBlockTypeReferenceDto(String name) {
        this.name = name;
    }

    @Override
    public TypeReferenceKind getType() {
        return TypeReferenceKind.FUNCTION_BLOCK;
    }

    public String getName() {
        return name;
    }
}
