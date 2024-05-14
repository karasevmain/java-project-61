package hexlet.code.Games;

import hexlet.code.Util;

public class Even {
    static final int ROUND_COUNT = 3;
    static final int  RESULT_ELEMENTS = 3;
    static final int  CONDITIONS_INDEX = 0;
    static final int  QUESTION_INDEX = 1;
    static final int  ANSWER_INDEX = 2;
    public static String[][] playEven() {
        String question;
        String correctAnswer;
        String[][] result = new String[ROUND_COUNT][RESULT_ELEMENTS];
        for (int i = 0; i < ROUND_COUNT; i++) {
            int number = Util.getRandomInt();
            question = "Question: " + number;
            correctAnswer = number % 2 == 0 ? "yes" : "no";
            result[i][CONDITIONS_INDEX] = "Answer 'yes' if the number is even, otherwise answer 'no'.";
            result[i][QUESTION_INDEX] = question;
            result[i][ANSWER_INDEX] = correctAnswer;
        }
        return result;
    }
}
