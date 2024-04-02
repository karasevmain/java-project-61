package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static String playGreet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
    public static void playEven(int evenGameRounds) {
        String userName = playGreet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < evenGameRounds; i++) {
            int number = getRandomInt(100);
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
    public static void playCalc(int calcGameRounds) {
        String userName = playGreet();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < calcGameRounds; i++) {
            int firstNumber = getRandomInt(20);
            int secondNumber = getRandomInt(20);
            int operationNumber = getRandomInt(2);
            int correctAnswer;
            if (operationNumber == 0) {
                System.out.println("Question: " + firstNumber + " + " + secondNumber);
                correctAnswer = firstNumber + secondNumber;
            } else if (operationNumber == 1) {
                System.out.println("Question: " + firstNumber + " - " + secondNumber);
                correctAnswer = firstNumber - secondNumber;
            } else {
                System.out.println("Question: " + firstNumber + " * " + secondNumber);
                correctAnswer = firstNumber * secondNumber;
            }
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(String.valueOf(correctAnswer))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
    public static int getRandomInt(int maxValue) {
        Random rnd = new Random();
        return rnd.nextInt(maxValue);
    }
}
