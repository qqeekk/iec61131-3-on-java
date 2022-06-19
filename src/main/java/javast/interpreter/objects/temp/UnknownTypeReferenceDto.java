package javast.interpreter.objects.temp;

import javast.interpreter.objects.enums.TypeReferenceKind;
import javast.interpreter.objects.types.TypeReferenceDto;

public class UnknownTypeReferenceDto extends TypeReferenceDto {

    private final String name;

    public UnknownTypeReferenceDto(String name) {
        this.name = name;
    }

    @Override
    public TypeReferenceKind getType() {
        return null;
    }

    public String getName() {
        return name;
    }
}
