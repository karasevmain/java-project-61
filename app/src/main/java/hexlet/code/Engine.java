package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    static final int MAX_RANDOM_INT = 100;
    static final int MAX_STEP_PROGRESSION = 10;
    static final int MAX_LENGTH_PROGRESSION = 5;
    static final int MIN_LENGTH_PROGRESSION = 5;
    static final int OPERATION_COUNT = 2;
    public static String playGreet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
    public static void playEven(int winScore) {
        String userName = playGreet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int score = 0;
        while (score < winScore) {
            int number = getRandomInt(MAX_RANDOM_INT);
            System.out.print("Question: " + number + "\nYour answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            if (!resultRound(userName, userAnswer, correctAnswer)) {
                break;
            }
            score++;
        }
        if (score == winScore) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
    public static void playCalc(int winScore) {
        String userName = playGreet();
        System.out.println("What is the result of the expression?");
        int score = 0;
        while (score < winScore) {
            int firstNumber = getRandomInt(MAX_RANDOM_INT);
            int secondNumber = getRandomInt(MAX_RANDOM_INT);
            int operationNumber = getRandomInt(OPERATION_COUNT);
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
            if (!resultRound(userName, userAnswer, String.valueOf(correctAnswer))) {
                break;
            }
            score++;
        }
        if (score == winScore) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
    public static void playGCD(int winScore) {
        String userName = playGreet();
        System.out.println("Find the greatest common divisor of given numbers.");
        int score = 0;
        while (score < winScore) {
            int firstNumber = getRandomInt(MAX_RANDOM_INT) + 1;
            int secondNumber = getRandomInt(MAX_RANDOM_INT) + 1;
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            int correctAnswer = getGCD(firstNumber, secondNumber);
            if (!resultRound(userName, userAnswer, String.valueOf(correctAnswer))) {
                break;
            }
            score++;
        }
        if (score == winScore) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
    public static void playProgression(int winScore) {
        String userName = playGreet();
        System.out.println("What number is missing in the progression?");
        int score = 0;
        while (score < winScore) {
            int initProgression = getRandomInt(MAX_RANDOM_INT);
            int stepProgression = getRandomInt(MAX_STEP_PROGRESSION) + 1;
            int lengthProgression = getRandomInt(MAX_LENGTH_PROGRESSION) + MIN_LENGTH_PROGRESSION;
            int replacementNumber = getRandomInt(lengthProgression);
            String[] progression = new String[lengthProgression];
            progression[0] = String.valueOf(initProgression);
            for (int j = 1; j < lengthProgression; j++) {
                progression[j] = String.valueOf(j * stepProgression + initProgression);
            }
            progression[replacementNumber] = "..";
            System.out.println("Question: " + String.join(" ", progression));
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            String correctAnswer = String.valueOf(initProgression + replacementNumber * stepProgression);
            if (!resultRound(userName, userAnswer, correctAnswer)) {
                break;
            }
            score++;
        }
        if (score == winScore) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
    public static void playPrime(int winScore) {
        String userName = playGreet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int score = 0;
        while (score < winScore) {
            int primeNumber = getRandomInt(MAX_RANDOM_INT);
            int sqrtNumber = (int) Math.sqrt(primeNumber) + 1;
            String correctAnswer = "yes";
            for (int i = 2; i <= sqrtNumber; i++) {
                if (primeNumber % i == 0) {
                    correctAnswer = "no";
                    break;
                }
            }
            System.out.println("Question: " + primeNumber);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            if (!resultRound(userName, userAnswer, correctAnswer)) {
                break;
            }
            score++;
        }
        if (score == winScore) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
    public static boolean resultRound(String username, String userAnswer, String correctAnswer) {
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + username + "!");
            return false;
        }
    }
    public static int getRandomInt(int maxValue) {
        Random rnd = new Random();
        return rnd.nextInt(maxValue);
    }
    public static int getGCD(int firstNumber, int secondNumber) {
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber -= secondNumber;
            } else {
                secondNumber -= firstNumber;
            }
        }
        return firstNumber;
    }
}
