package javast.interpreter.objects.temp;

import javast.interpreter.objects.variables.VariableDto;
import javast.sablecc.node.PInitialElement;

public class UnknownTypeVariableDto extends VariableDto {

    private final PInitialElement initialValue;

    public UnknownTypeVariableDto(String name, UnknownTypeReferenceDto type, PInitialElement initialValue) {
        super(name, type);
        this.initialValue = initialValue;
    }

    public PInitialElement getInitialValue() {
        return initialValue;
    }
}
