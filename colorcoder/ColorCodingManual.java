package colorcoder;

public class ColorCodingManual {
    public static String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair | Major | Minor\n");
        sb.append("--------------------\n");
        int total = ColorCoding.MAJOR_COUNT * ColorCoding.MINOR_COUNT;
        for (int i = 1; i <= total; i++) {
            ColorPair p = ColorCoding.getColorFromPairNumber(i);
            sb.append(String.format("%-4d | %-5s | %-5s%n",
                i, p.getMajor().getName(), p.getMinor().getName()));
        }
        return sb.toString();
    }
}
