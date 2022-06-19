package javast.interpreter.objects.variables;

import javast.interpreter.objects.types.TypeReferenceDto;

public class AliasTypeVariableDto extends VariableDto {

    private final VariableDto initialValue;

    public AliasTypeVariableDto(String name, TypeReferenceDto type, VariableDto initialValue) {
        super(name, type);
        this.initialValue = initialValue;
    }

    public VariableDto getInitialValue() {
        return initialValue;
    }
}

