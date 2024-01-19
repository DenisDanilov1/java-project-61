package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calculator {
    public static final String task = "What is the result of the expression?";
    public static final int MIN= 0;
    public static final int MAX = 10;

    public static void calc() {
        String[][] data = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            String[] operation = {"*", "-", "+"};
            int randIndex = Utils.generateNumber(MIN, operation.length-1);
            int random1 = Utils.generateNumber(MIN, MAX);
            int random2 = Utils.generateNumber(MIN, MAX);
            String operator = operation[randIndex];
            int correctAnswer = 0;
            String question = random1 + " " + operator + " " + random2;
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
                    System.out.println("Incorrect operator is selected");
            }
            String correct = String.valueOf(correctAnswer);

            data[i][0] = question;
            data[i][1] = correct;
        }
        Engine.engine(data, task);
    }
}
