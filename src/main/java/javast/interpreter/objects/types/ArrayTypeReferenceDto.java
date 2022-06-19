package javast.interpreter.objects.types;

import javast.interpreter.objects.enums.TypeReferenceKind;

import java.util.Collection;
import java.util.Map;

public class ArrayTypeReferenceDto extends TypeReferenceDto {

    private final TypeReferenceDto variableType;
    private final Collection<Map.Entry<Integer, Integer>> dimensions;

    public ArrayTypeReferenceDto(TypeReferenceDto type, Collection<Map.Entry<Integer, Integer>> dimensions) {

        this.variableType = type;
        this.dimensions = dimensions;
    }

    @Override
    public TypeReferenceKind getType() {
        return TypeReferenceKind.ARRAY;
    }

    public TypeReferenceDto getVariableType() {
        return variableType;
    }

    public Collection<Map.Entry<Integer, Integer>> getDimensions() {
        return dimensions;
    }
}


