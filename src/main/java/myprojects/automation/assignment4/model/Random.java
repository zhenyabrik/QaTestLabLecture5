package myprojects.automation.assignment4.model;


public class Random {

    public static int genInt(int from, int to) {
        int tmp = 0;
        if (to >= from)
            tmp = (int) (from + Math.round((Math.random() * (to - from))));
        return tmp;
    }

    public static float genFloat(double from, double to) {
        float tmp = .0f;
        if (to >= from)
            tmp = (float) (from + (Math.random() * (to - from)));
        return tmp;
    }
}
