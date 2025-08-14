package colorcoder;

public interface Color {
    int getIndex();
    String getName();

    static <T extends Enum<T> & Color> T fromIndex(T[] values, int index) {
        if (index < 0 || index >= values.length) {
            throw new IllegalArgumentException("Invalid index: " + index);
        }
        return values[index];
    }
}
