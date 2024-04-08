package hexlet.code.Games;

import java.util.Scanner;

public class Greet {
    public static String playGreet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
