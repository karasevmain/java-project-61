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
            printResultRound(userAnswer, correctAnswer);
        }
        System.out.println("Congratulations, " + userName + "!");
    }
    public static void playCalc(int calcGameRounds) {
        String userName = playGreet();
        System.out.println("What is the result of the expression?");
        int maxRandomInt = 20;
        int operationCount = 2;
        for (int i = 0; i < calcGameRounds; i++) {
            int firstNumber = getRandomInt(maxRandomInt);
            int secondNumber = getRandomInt(maxRandomInt);
            int operationNumber = getRandomInt(operationCount);
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
            printResultRound(userAnswer, String.valueOf(correctAnswer));
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void playGCD(int nodGameRounds) {
        String userName = playGreet();
        System.out.println("Find the greatest common divisor of given numbers.");
        int maxRandomInt = 100;
        for (int i = 0; i < nodGameRounds; i++) {
            int firstNumber = getRandomInt(maxRandomInt) + 1;
            int secondNumber = getRandomInt(maxRandomInt) + 1;
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            int correctAnswer = getGCD(firstNumber, secondNumber);
            printResultRound(userAnswer, String.valueOf(correctAnswer));
        }
    }

    public static void playProgression(int progressionGameRounds){

    }
    public static void printResultRound(String userAnswer, String correctAnswer) {
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        }
    }
    public static int getRandomInt(int maxValue) {
        Random rnd = new Random();
        return rnd.nextInt(maxValue);
    }

    public static int getGCD(int firstNumber, int secondNumber) {
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber -=secondNumber;
            } else if (firstNumber < secondNumber) {
                secondNumber -= firstNumber;
            } else return firstNumber;
        }
        return firstNumber;
    }
}
