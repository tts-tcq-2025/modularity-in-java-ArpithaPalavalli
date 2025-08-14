package colorcoder;

public enum MajorColor implements Color {
    WHITE(0, "White"),
    RED(1, "Red"),
    BLACK(2, "Black"),
    YELLOW(3, "Yellow"),
    VIOLET(4, "Violet");

    private final int index;
    private final String name;

    MajorColor(int index, String name) {
        this.index = index;
        this.name = name;
    }

    @Override public int getIndex() { return index; }
    @Override public String getName() { return name; }

    public static MajorColor fromIndex(int index) {
        return Color.fromIndex(values(), index);
    }
}
