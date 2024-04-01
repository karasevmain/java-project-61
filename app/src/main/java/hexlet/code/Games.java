package hexlet.code;

import java.util.Scanner;

public class Games {
    public static String playGreet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
    public static void playEven(int[] evenGameNumbers) {
        String userName = playGreet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int number : evenGameNumbers) {
            System.out.print("Question: " + number + "\nYour answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
