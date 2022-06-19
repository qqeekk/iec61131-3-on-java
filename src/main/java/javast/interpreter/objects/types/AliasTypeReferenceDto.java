package javast.interpreter.objects.types;

import javast.interpreter.objects.enums.TypeReferenceKind;
import javast.interpreter.objects.variables.VariableDto;

public class AliasTypeReferenceDto extends TypeReferenceDto {

    private final String name;

    public AliasTypeReferenceDto(String name) {
        this.name = name;
    }

    @Override
    public TypeReferenceKind getType() {
        return TypeReferenceKind.ALIAS;
    }

    public String getName() {
        return name;
    }
}
