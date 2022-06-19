package javast.interpreter.objects.variables;

import javast.interpreter.objects.types.TypeReferenceDto;

public class StringTypeVariableDto extends VariableDto {

    private final String initialValue;

    public StringTypeVariableDto(String name, TypeReferenceDto type, String initialValue) {
        super(name, type);
        this.initialValue = initialValue;
    }

    public String getInitialValue() {
        return initialValue;
    }
}
