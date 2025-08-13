package colorcoder;

public enum MinorColor implements Color {
    BLUE(0, "Blue"),
    ORANGE(1, "Orange"),
    GREEN(2, "Green"),
    BROWN(3, "Brown"),
    SLATE(4, "Slate");

    private final int index;
    private final String name;

    MinorColor(int index, String name) {
        this.index = index;
        this.name = name;
    }

    @Override public int getIndex() { return index; }
    @Override public String getName() { return name; }

    public static MinorColor fromIndex(int index) {
        return Color.fromIndex(values(), index);
    }
}
