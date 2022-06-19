package javast.interpreter.objects.library;

import javast.interpreter.objects.enums.PouKind;
import javast.interpreter.objects.types.TypeReferenceDto;
import javast.interpreter.objects.variables.VariableDto;
import javast.sablecc.node.PStatement;

import java.util.ArrayList;
import java.util.Collection;

public record PouDeclarationDto(
        PouKind kind,
        String name,
        TypeReferenceDto returnType,
        Collection<VariableDto> inputs,
        Collection<VariableDto> outputs,
        Collection<VariableDto> io,
        Collection<VariableDto> locals,
        Collection<VariableDto> temps,
        Collection<VariableDto> externals,
        Collection<PStatement> body) {
    public PouDeclarationDto(
        PouKind kind,
        String name,
        TypeReferenceDto returnType) {
        this(kind, name, returnType,
            new ArrayList<>(),
            new ArrayList<>(),
            new ArrayList<>(),
            new ArrayList<>(),
            new ArrayList<>(),
            new ArrayList<>(),
            new ArrayList<>());
    }
}
