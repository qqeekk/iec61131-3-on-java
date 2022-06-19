package javast.interpreter.objects.enums;

public enum TypeReferenceKind {
    PRIMITIVE, // Unary primitive type (real, bool, int, etc.).
    STRING, // STRING. Optional int length.
    STRUCT, // Custom struct.
    FUNCTION_BLOCK, // Function block.
    ARRAY, // Array. Required int length. Has related VariableType.
    ALIAS // Has related VariableType.
}

