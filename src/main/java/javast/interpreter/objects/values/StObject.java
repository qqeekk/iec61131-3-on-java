package javast.interpreter.objects.values;

import java.lang.reflect.Type;

public class StObject {
    private Object value;
    private final Type type;

    public StObject(Object value, Type type) {
        this.value = value;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    public String getAsString() {
        return (String)value;
    }

    public int[] getAsIntArray() {
        return (int[])value;
    }

    public long getAsInt() {
        return (Long) value;
    }
}
