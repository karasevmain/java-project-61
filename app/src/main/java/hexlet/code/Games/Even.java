package hexlet.code.Games;

import hexlet.code.Util;

public class Even {
    public static String playEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int number = Util.getRandomInt();
        System.out.println("Question: " + number);
        return number % 2 == 0 ? "yes" : "no";
    }
}
