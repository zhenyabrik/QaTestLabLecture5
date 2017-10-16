package myprojects.automation.utils;

public class Timeouts {
    public static final int LONG = 120;
    public static final int DEFAULT = 6000;
    public static final int SMALL = 10;

    public static int getImplicityWait() {
        return DEFAULT;
    }
}
