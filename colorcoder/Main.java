package colorcoder;

public class Main {
    public static void main(String[] args) {
        testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
        testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);

        System.out.println(ColorCodingManual.generate());
    }

    private static void testNumberToPair(int num, MajorColor expMajor, MinorColor expMinor) {
        ColorPair pair = ColorCoding.getColorFromPairNumber(num);
        assert pair.getMajor() == expMajor;
        assert pair.getMinor() == expMinor;
    }

    private static void testPairToNumber(MajorColor major, MinorColor minor, int expected) {
        assert ColorCoding.getPairNumberFromColor(major, minor) == expected;
    }
}
