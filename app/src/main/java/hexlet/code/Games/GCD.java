package hexlet.code.Games;

import hexlet.code.Util;

public class GCD {
    static final int ROUND_COUNT = 3;
    static final int  RESULT_ELEMENTS = 3;
    static final int  CONDITIONS_INDEX = 0;
    static final int  QUESTION_INDEX = 1;
    static final int  ANSWER_INDEX = 2;
    public static String[][] playGCD() {
        String question;
        String correctAnswer;
        String[][] result = new String[ROUND_COUNT][RESULT_ELEMENTS];
        for (int i = 0; i < ROUND_COUNT; i++) {
            int firstNumber = Util.getRandomInt() + 1;
            int secondNumber = Util.getRandomInt() + 1;
            question = "Question: " + firstNumber + " " + secondNumber;
            correctAnswer = String.valueOf(getGCD(firstNumber, secondNumber));
            result[i][CONDITIONS_INDEX] = "Find the greatest common divisor of given numbers.";
            result[i][QUESTION_INDEX] = question;
            result[i][ANSWER_INDEX] = correctAnswer;
        }
        return result;
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
