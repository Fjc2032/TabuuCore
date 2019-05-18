package nl.tabuu.tabuucore.util;

public class Random extends java.util.Random {

    /**
     * Returns a random double between the two values.
     * @param min Minimum value (included).
     * @param max Maximum value (excluded).
     */
    public static double range(double min, double max){
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

}
