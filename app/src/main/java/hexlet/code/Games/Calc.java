package hexlet.code.Games;

import hexlet.code.Util;

public class Calc {
    static final int OPERATION_COUNT = 2;
    public static String playCalc() {
        System.out.println("What is the result of the expression?");
        char[] operations = {'+', '-', '*'};
        int firstNumber = Util.getRandomInt();
        int secondNumber = Util.getRandomInt();
        int operationNumber = Util.getRandomInt(OPERATION_COUNT);
        int correctAnswer;
        if (operations[operationNumber] == '+') {
            System.out.println("Question: " + firstNumber + " + " + secondNumber);
            correctAnswer = firstNumber + secondNumber;
        } else if (operations[operationNumber] == '-') {
            System.out.println("Question: " + firstNumber + " - " + secondNumber);
            correctAnswer = firstNumber - secondNumber;
        } else {
            System.out.println("Question: " + firstNumber + " * " + secondNumber);
            correctAnswer = firstNumber * secondNumber;
        }
        return String.valueOf(correctAnswer);
    }
}
