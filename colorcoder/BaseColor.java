package colorcoder;

public abstract class BaseColor implements Color {
    private final int index;
    private final String name;

    protected BaseColor(int index, String name) {
        this.index = index;
        this.name = name;
    }

    @Override public int getIndex() { return index; }
    @Override public String getName() { return name; }
}
