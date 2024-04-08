package hexlet.code.Games;

import hexlet.code.Util;

public class GCD {
    static final int MAX_RANDOM_INT = 100;
    public static String playGCD() {
        System.out.println("Find the greatest common divisor of given numbers.");
        int firstNumber = Util.getRandomInt(MAX_RANDOM_INT) + 1;
        int secondNumber = Util.getRandomInt(MAX_RANDOM_INT) + 1;
        System.out.println("Question: " + firstNumber + " " + secondNumber);
        int correctAnswer = getGCD(firstNumber, secondNumber);
        return String.valueOf(correctAnswer);
    }
    public static int getGCD(int firstNumber, int secondNumber) {
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber -= secondNumber;
            } else {
                secondNumber -= firstNumber;
            }
        }
        return firstNumber;
    }
}
