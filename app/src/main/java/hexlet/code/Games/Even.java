package hexlet.code.Games;

import hexlet.code.Util;

public class Even {
    static final int MAX_RANDOM_INT = 100;
    public static String playEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int number = Util.getRandomInt(MAX_RANDOM_INT);
        System.out.println("Question: " + number);
        return number % 2 == 0 ? "yes" : "no";
    }
}
