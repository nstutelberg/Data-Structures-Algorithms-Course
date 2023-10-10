package Week7Constructors;

import java.util.Random;

public class RandomUtils {
    private static Random random = new Random();
    // The below function returns a boolean value based on the probability `p`. So if p is 0.5, then half the time 0 is returned, and half the time 1 is returned (on avg)

    public static boolean randNumberGenerator(double p) {
        return random.nextDouble() < p;
    }
}
