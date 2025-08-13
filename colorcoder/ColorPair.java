package colorcoder;

public class ColorPair {
    private final MajorColor majorColor;
    private final MinorColor minorColor;

    public ColorPair(MajorColor majorColor, MinorColor minorColor) {
        this.majorColor = majorColor;
        this.minorColor = minorColor;
    }

    public MajorColor getMajor() {
        return majorColor;
    }

    public MinorColor getMinor() {
        return minorColor;
    }

    @Override
    public String toString() {
        return majorColor.getName() + " " + minorColor.getName();
    }
}
