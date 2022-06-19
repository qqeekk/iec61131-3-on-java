package javast.interpreter.objects.variables;

import javast.interpreter.objects.types.TypeReferenceDto;

public abstract class VariableDto {
    private final String name;
    private final TypeReferenceDto type;

    public VariableDto(String name, TypeReferenceDto type){
        this.name = name;
        this.type = type;
    }

    public String getVariableName() {
        return name;
    }

    public TypeReferenceDto getVariableType() {
        return type;
    }
}

