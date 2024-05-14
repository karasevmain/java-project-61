package hexlet.code;

import hexlet.code.Games.Greet;
import java.util.Scanner;

public class Engine {
    static final int ROUND_COUNT = 3;
    static final int  CONDITIONS_INDEX = 0;
    static final int  QUESTION_INDEX = 1;
    static final int  ANSWER_INDEX = 2;
    public static void playGames(String gameNumber) {
        String userName = Greet.playGreet();
        if (!gameNumber.equals("1")) {
            String[][] resultGame = App.startRound(gameNumber);
            System.out.println(resultGame[0][CONDITIONS_INDEX]);
            for (int i = 0; i < ROUND_COUNT; i++) {
                String question = resultGame[i][QUESTION_INDEX];
                System.out.println(question);
                String correctAnswer = resultGame[i][ANSWER_INDEX];
                if (!resultRound(userName, correctAnswer)) {
                    System.exit(0);
                }
            }
            System.out.println("Congratulations, " + userName + "!");
        }
    }
    public static boolean resultRound(String userName, String correctAnswer) {
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + userName + "!");
        }
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }
}
