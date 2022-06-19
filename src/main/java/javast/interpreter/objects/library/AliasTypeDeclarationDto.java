package javast.interpreter.objects.library;

import javast.interpreter.objects.variables.VariableDto;

public class AliasTypeDeclarationDto extends TypeDeclarationDto {
    private final VariableDto reference;

    public AliasTypeDeclarationDto(int blockNum, String name, VariableDto reference) {
        super(blockNum, name);
        this.reference = reference;
    }

    public VariableDto getReference() {
        return reference;
    }
}

