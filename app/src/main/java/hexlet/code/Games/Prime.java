package hexlet.code.Games;

import hexlet.code.Util;

public class Prime {
    static final int MAX_RANDOM_INT = 100;
    public static String playPrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int primeNumber = Util.getRandomInt(MAX_RANDOM_INT);
        int sqrtNumber = (int) Math.sqrt(primeNumber) + 1;
        String correctAnswer = "yes";
        for (int i = 2; i <= sqrtNumber; i++) {
            if (primeNumber % i == 0) {
                correctAnswer = "no";
                break;
            }
        }
        System.out.println("Question: " + primeNumber);
        return correctAnswer;
    }
}
