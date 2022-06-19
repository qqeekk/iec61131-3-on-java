package javast.interpreter.objects.library;

public abstract class TypeDeclarationDto {
    private final int blockNum;
    private final String name;

    public TypeDeclarationDto(int blockNum, String name) {
        this.blockNum = blockNum;
        this.name = name;
    }

    public int getBlockNum() {
        return blockNum;
    }

    public String getName() {
        return name;
    }
}

