package hexlet.code;

import java.util.Scanner;

public class App {
    final static int WIN_SCORE = 3;
    public static void main(String[] args) {
        String[] gameList = {"Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"};
        System.out.println("Please enter the game number and press Enter.");
        String selectedGame = sendGameList(gameList);
        switch (selectedGame) {
            case "0":
                break;
            case "1":
                Engine.playGreet();
                break;
            case "2":
                Engine.playEven(WIN_SCORE);
                break;
            case "3":
                Engine.playCalc(WIN_SCORE);
                break;
            case "4":
                Engine.playGCD(WIN_SCORE);
                break;
            case "5":
                Engine.playProgression(WIN_SCORE);
                break;
            case "6":
                Engine.playPrime(WIN_SCORE);
                break;
            default:
                System.out.println("Error command number");
                break;
        }
    }
    public static String sendGameList(String[] gameList) {
        for (int i = 0; i < gameList.length; i++) {
            System.out.println(i + " - " + gameList[i]);
        }
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
