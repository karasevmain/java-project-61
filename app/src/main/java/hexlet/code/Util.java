package hexlet.code;

import java.util.Random;

public class Util {
    public static int getRandomInt(int maxValue) {
        Random rnd = new Random();
        return rnd.nextInt(maxValue);
    }
}
