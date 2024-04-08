package hexlet.code;

import hexlet.code.Games.Calc;
import hexlet.code.Games.Even;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Greet;
import hexlet.code.Games.Prime;
import hexlet.code.Games.Progression;


import java.util.Scanner;

public class Engine {
    static final int ROUND_COUNT = 3;
    public static void playGames() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String gameNumber = scanner.nextLine();
        String userName = Greet.playGreet();
        if (!gameNumber.equals("1")) {
            for (int i = 0; i < ROUND_COUNT; i++) {
                String userAnswer = playGame(gameNumber);
                if (!resultRound(userName, userAnswer)) {
                    System.exit(0);
                }
            }
            System.out.println("Congratulations, " + userName + "!");
        }
    }
    public static String playGame(String gameNumber) {
        switch (gameNumber) {
            case "0":
                break;
            case "1":
                Greet.playGreet();
            case "2":
                return Even.playEven();
            case "3":
                return Calc.playCalc();
            case "4":
                return GCD.playGCD();
            case "5":
                return Progression.playProgression();
            case "6":
                return Prime.playPrime();
            default:
                System.out.println("Error game command");
                System.exit(0);
        }
        return "";
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
