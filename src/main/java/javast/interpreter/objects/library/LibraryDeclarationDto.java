package javast.interpreter.objects.library;

import java.util.HashMap;

public record LibraryDeclarationDto(
    HashMap<String, PouDeclarationDto> programs,
    HashMap<String, PouDeclarationDto> functions,
    HashMap<String, PouDeclarationDto> functionBlocks,
    HashMap<String, TypeDeclarationDto> types) {
    public boolean isRegistered(String name) {
        return functions.containsKey(name) || functionBlocks.containsKey(name) || types.containsKey(name);
    }
}

