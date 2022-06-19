package javast.interpreter.objects.library;

import javast.interpreter.objects.variables.VariableDto;

import java.util.Collection;

public class StructTypeDeclarationDto extends TypeDeclarationDto {

    private final Collection<VariableDto> structure;

    public StructTypeDeclarationDto(int blockNum, String name, Collection<VariableDto> fields) {
        super(blockNum, name);
        this.structure = fields;
    }

    public Collection<VariableDto> getStructure() {
        return structure;
    }
}
