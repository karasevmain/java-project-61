package hexlet.code.Games;

import hexlet.code.Util;

public class Progression {
    static final int MAX_STEP_PROGRESSION = 10;
    static final int MAX_LENGTH_PROGRESSION = 5;
    static final int MIN_LENGTH_PROGRESSION = 5;
    static final int ROUND_COUNT = 3;
    static final int  RESULT_ELEMENTS = 3;
    static final int  CONDITIONS_INDEX = 0;
    static final int  QUESTION_INDEX = 1;
    static final int  ANSWER_INDEX = 2;
    public static String[][] playProgression() {
        String question;
        String correctAnswer;
        String[][] result = new String[ROUND_COUNT][RESULT_ELEMENTS];
        for (int i = 0; i < ROUND_COUNT; i++) {
            int initProgression = Util.getRandomInt();
            int stepProgression = Util.getRandomInt(MAX_STEP_PROGRESSION) + 1;
            int lengthProgression = Util.getRandomInt(MAX_LENGTH_PROGRESSION) + MIN_LENGTH_PROGRESSION;
            int replacementNumber = Util.getRandomInt(lengthProgression);
            String[] progression = new String[lengthProgression];
            progression[0] = String.valueOf(initProgression);
            for (int j = 1; j < lengthProgression; j++) {
                progression[j] = String.valueOf(j * stepProgression + initProgression);
            }
            progression[replacementNumber] = "..";
            question = "Question: " + String.join(" ", progression);
            correctAnswer = String.valueOf(initProgression + replacementNumber * stepProgression);
            result[i][CONDITIONS_INDEX] = "What number is missing in the progression?";
            result[i][QUESTION_INDEX] = question;
            result[i][ANSWER_INDEX] = correctAnswer;
        }
        return result;
    }
}
