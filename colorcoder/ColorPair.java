package colorcoder;

public class ColorPair {
    private final MajorColor major;
    private final MinorColor minor;

    public ColorPair(MajorColor major, MinorColor minor) {
        this.major = major;
        this.minor = minor;
    }

    public MajorColor getMajor() { return major; }
    public MinorColor getMinor() { return minor; }

    @Override
    public String toString() {
        return major.getName() + " " + minor.getName();
    }
}
