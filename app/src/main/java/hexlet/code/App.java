package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] gameList = {"Exit", "Greet", "Even"};
        int[] evenGameNumbers = {38, 35, 91};
        System.out.println("Please enter the game number and press Enter.");
        String selectedGame = sendGameList(gameList);
        switch (selectedGame) {
            case "0":
                break;
            case "1":
                Games.playGreet();
            case "2":
                Games.playEven(evenGameNumbers);
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
