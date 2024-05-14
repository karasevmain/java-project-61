package hexlet.code.Games;

import hexlet.code.Util;

public class Calc {
    static final int OPERATION_COUNT = 2;
    static final int ROUND_COUNT = 3;
    static final int  RESULT_ELEMENTS = 3;
    static final int  CONDITIONS_INDEX = 0;
    static final int  QUESTION_INDEX = 1;
    static final int  ANSWER_INDEX = 2;
    public static String[][] playCalc() {
        String question;
        String correctAnswer;
        String[][] result = new String[ROUND_COUNT][RESULT_ELEMENTS];
        char[] operations = {'+', '-', '*'};
        for (int i = 0; i < 3; i++) {
            int firstNumber = Util.getRandomInt();
            int secondNumber = Util.getRandomInt();
            int operationNumber = Util.getRandomInt(OPERATION_COUNT);
            if (operations[operationNumber] == '+') {
                question = "Question: " + firstNumber + " + " + secondNumber;
                correctAnswer = String.valueOf(firstNumber + secondNumber);
            } else if (operations[operationNumber] == '-') {
                question = "Question: " + firstNumber + " - " + secondNumber;
                correctAnswer = String.valueOf(firstNumber - secondNumber);
            } else {
                question = "Question: " + String.valueOf(firstNumber + " * " + secondNumber);
                correctAnswer = String.valueOf(firstNumber * secondNumber);
            }
            result[i][CONDITIONS_INDEX] = "What is the result of the expression?";
            result[i][QUESTION_INDEX] = question;
            result[i][ANSWER_INDEX] = correctAnswer;
        }
        return result;
    }
}
