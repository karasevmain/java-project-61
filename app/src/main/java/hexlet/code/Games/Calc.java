package hexlet.code.Games;

import hexlet.code.Util;

public class Calc {
    static final int MAX_RANDOM_INT = 100;
    static final int OPERATION_COUNT = 2;
    public static String playCalc() {
        System.out.println("What is the result of the expression?");
        int score = 0;
        int firstNumber = Util.getRandomInt(MAX_RANDOM_INT);
        int secondNumber = Util.getRandomInt(MAX_RANDOM_INT);
        int operationNumber = Util.getRandomInt(OPERATION_COUNT);
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
        return String.valueOf(correctAnswer);
    }
}
