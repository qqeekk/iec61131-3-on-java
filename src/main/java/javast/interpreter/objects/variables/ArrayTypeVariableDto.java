package javast.interpreter.objects.variables;

import javast.interpreter.objects.types.ArrayTypeReferenceDto;
import javast.sablecc.node.PArrayInitialElements;

import java.util.Collection;

public class ArrayTypeVariableDto extends VariableDto {
    private final Collection<PArrayInitialElements> elements;

    public ArrayTypeVariableDto(String name,
                                ArrayTypeReferenceDto type,
                                Collection<PArrayInitialElements> elements) {
        super(name, type);
        this.elements = elements;
    }

    public Collection<PArrayInitialElements> getInitialValue() {
        return elements;
    }
}
