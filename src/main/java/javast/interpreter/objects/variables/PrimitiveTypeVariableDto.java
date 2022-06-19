package javast.interpreter.objects.variables;

import javast.interpreter.objects.types.PrimitiveTypeReferenceDto;
import javast.sablecc.node.PConstant;

public class PrimitiveTypeVariableDto extends VariableDto {
    private final PConstant constant;

    public PrimitiveTypeVariableDto(String name,
                                    PrimitiveTypeReferenceDto type,
                                    PConstant constant) {
        super(name, type);
        this.constant = constant;
    }

    public PConstant getInitialValue() {
        return constant;
    }
}

