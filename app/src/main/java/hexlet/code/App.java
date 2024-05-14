package hexlet.code;

import hexlet.code.Games.Greet;
import hexlet.code.Games.Even;
import hexlet.code.Games.Calc;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Progression;
import hexlet.code.Games.Prime;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String[] gameList = {"Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"};
        for (int i = 0; i < gameList.length; i++) {
            System.out.println(i + " - " + gameList[i]);
        }
        String gameNumber = pickGame();
        Engine.playGames(gameNumber);
    }
    public static String[][] startRound(String gameNumber) {
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
        return null;
    }
    public static String pickGame() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}