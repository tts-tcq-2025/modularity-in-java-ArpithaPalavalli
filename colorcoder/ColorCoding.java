package colorcoder;

public class ColorCoding {
    public static final int MAJOR_COUNT = MajorColor.values().length;
    public static final int MINOR_COUNT = MinorColor.values().length;

    public static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroIndex = pairNumber - 1;
        return new ColorPair(
            MajorColor.fromIndex(zeroIndex / MINOR_COUNT),
            MinorColor.fromIndex(zeroIndex % MINOR_COUNT)
        );
    }

    public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * MINOR_COUNT + minor.getIndex() + 1;
    }
}
