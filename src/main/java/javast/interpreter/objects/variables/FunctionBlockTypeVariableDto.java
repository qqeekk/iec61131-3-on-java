package javast.interpreter.objects.variables;

import javast.interpreter.objects.types.FunctionBlockTypeReferenceDto;
import javast.sablecc.node.AStructureElementInitialization;

import java.util.Collection;

public class FunctionBlockTypeVariableDto extends VariableDto {
    private final Collection<AStructureElementInitialization> assignments;

    public FunctionBlockTypeVariableDto(String name,
                                        FunctionBlockTypeReferenceDto type,
                                        Collection<AStructureElementInitialization> assignments) {
        super(name, type);
        this.assignments = assignments;
    }

    public Collection<AStructureElementInitialization> getInitialValue() {
        return assignments;
    }
}


