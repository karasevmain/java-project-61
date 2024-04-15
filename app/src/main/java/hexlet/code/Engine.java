package hexlet.code;

import hexlet.code.Games.Greet;
import java.util.Scanner;

public class Engine {
    static final int ROUND_COUNT = 3;
    public static void playGames(String gameNumber) {
        String userName = Greet.playGreet();
        if (!gameNumber.equals("1")) {
            for (int i = 0; i < ROUND_COUNT; i++) {
                String correctAnswer = App.startRound(gameNumber);
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
