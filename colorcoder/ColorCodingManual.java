package colorcoder;

public class ColorCodingManual {
    public static String generateManual() {
        StringBuilder manual = new StringBuilder();
        manual.append("Color Code Reference Manual:\n");
        manual.append("Pair Number | Major Color | Minor Color\n");
        manual.append("----------------------------------------\n");

        int totalPairs = ColorCoding.NUMBER_OF_MAJOR_COLORS * ColorCoding.NUMBER_OF_MINOR_COLORS;
        for (int pairNumber = 1; pairNumber <= totalPairs; pairNumber++) {
            ColorPair pair = ColorCoding.getColorFromPairNumber(pairNumber);
            manual.append(String.format("%-11d | %-11s | %-11s%n",
                    pairNumber,
                    pair.getMajor().getName(),
                    pair.getMinor().getName()));
        }
        return manual.toString();
    }
}
