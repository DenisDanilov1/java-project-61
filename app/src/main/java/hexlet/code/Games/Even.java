package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int MIN= 1;
    public static final int MAX = 100;

    public static void playEven() {
        String [][] data = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int random = Utils.generateNumber(MIN, MAX);
            String question = Integer.toString(random);
            String correctAnswer = random % 2 == 0 ? "yes" : "no";

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }
        Engine.playEngine(data, task);
    }
}
