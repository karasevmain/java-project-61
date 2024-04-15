package hexlet.code;

import java.util.Random;

public class Util {
    static final int MAX_RANDOM_INT = 100;
    public static int getRandomInt() {
        Random rnd = new Random();
        return rnd.nextInt(MAX_RANDOM_INT);
    }

    public static int getRandomInt(int maxRandom) {
        Random rnd = new Random();
        return rnd.nextInt(maxRandom);
    }
}
