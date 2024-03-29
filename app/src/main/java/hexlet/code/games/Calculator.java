package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {

    public static final String TASK = "What is the result of the expression?";
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void playCalc() {
        String[][] data = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            String[] operation = {"*", "-", "+"};
            int randIndex = Utils.generateNumber(0, operation.length - 1);
            int random1 = Utils.generateNumber(MIN, MAX);
            int random2 = Utils.generateNumber(MIN, MAX);
            String operator = operation[randIndex];
            String question = random1 + " " + operator + " " + random2;
            String correct = String.valueOf(calcCase(operator, random1, random2));

            data[i][0] = question;
            data[i][1] = correct;
        }
        Engine.playEngine(data, TASK);
    }

    public static int calcCase(String operator, int random1, int random2) {
        int correctAnswer = 0;
        switch (operator) {
            case "*":
                correctAnswer = random1 * random2;
                break;
            case "-":
                correctAnswer = random1 - random2;
                break;
            case "+":
                correctAnswer = random1 + random2;
                break;
            default:
                System.out.println("Invalid operator " + operator + " passed");
        }
        return correctAnswer;
    }
}
