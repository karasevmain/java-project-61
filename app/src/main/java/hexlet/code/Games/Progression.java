package hexlet.code.Games;

import hexlet.code.Util;

public class Progression {
    static final int MAX_STEP_PROGRESSION = 10;
    static final int MAX_LENGTH_PROGRESSION = 5;
    static final int MIN_LENGTH_PROGRESSION = 5;
    public static String playProgression() {
        System.out.println("What number is missing in the progression?");
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
        System.out.println("Question: " + String.join(" ", progression));
        return String.valueOf(initProgression + replacementNumber * stepProgression);
    }
}
