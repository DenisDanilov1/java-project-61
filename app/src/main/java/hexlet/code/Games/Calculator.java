package hexlet.code.Games;

import hexlet.code.Engine;
import java.util.Random;

public class Calculator {
    public static void calc() {
        String task = "What is the result of the expression?";
        String[] questions = new String[3];
        int[] results = new int[3];
        for (int i = 0; i < 3; i = i + 1) {
            String[] operation = {" * ", " - ", " + "};
            Random random = new Random();
            int randIndex = random.nextInt(2);
            int random1 = random.nextInt(10);
            int random2 = random.nextInt(10);
            String operator = operation[randIndex];
            questions[i] = random1 + operator + random2;
            switch (operator) {
                case " * ":
                    results[i] = random1 * random2;
                    break;
                case " - ":
                    results[i] = random1 - random2;
                    break;
                case " + ":
                    results[i] = random1 + random2;
                    break;
                default:
                    System.out.println("Incorrect operator is selected");
            }
        }
        Engine.engine(questions, results, task);
    }
}
