package hexlet.code.Games;

import hexlet.code.Util;

public class Prime {
    static final int ROUND_COUNT = 3;
    static final int  RESULT_ELEMENTS = 3;
    static final int  CONDITIONS_INDEX = 0;
    static final int  QUESTION_INDEX = 1;
    static final int  ANSWER_INDEX = 2;
    public static String[][] playPrime() {
        String question;
        String correctAnswer;
        String[][] result = new String[ROUND_COUNT][RESULT_ELEMENTS];
        for (int i = 0; i < ROUND_COUNT; i++) {
            int primeNumber = Util.getRandomInt();
            int sqrtNumber = (int) Math.sqrt(primeNumber) + 1;
            correctAnswer = "yes";
            for (int j = 2; i <= sqrtNumber; j++) {
                if (primeNumber % j == 0) {
                    correctAnswer = "no";
                    break;
                }
            }
            question = "Question: " + primeNumber;
            result[i][CONDITIONS_INDEX] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
            result[i][QUESTION_INDEX] = question;
            result[i][ANSWER_INDEX] = correctAnswer;
        }
        return result;
    }
}
