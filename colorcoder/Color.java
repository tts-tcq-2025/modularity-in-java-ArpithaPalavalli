package colorcoder;

public interface Color {
    int getIndex();
    String getName();

    static <T extends Enum<T> & Color> T fromIndex(T[] values, int index) {
        for (T color : values) {
            if (color.getIndex() == index) {
                return color;
            }
        }
        throw new IllegalArgumentException("Invalid index: " + index);
    }
}
