package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final String task = "What number is missing in the progression?";
    public static final int MIN = 1;
    public static final int MAX = 20;

    private static final int PROGRESSION_LENGHT = 10;

    public static void playProgression() {
        String[][] data = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int step = Utils.generateNumber(MIN, MAX);
            int first = Utils.generateNumber(MIN, MAX);
            int randIndex = Utils.generateNumber(MIN, PROGRESSION_LENGHT);
            String[] progression = makeProgression(first, step, PROGRESSION_LENGHT);
            String correctAnswer = progression[randIndex];
            progression[randIndex] = "..";
            String question = String.join(" ", progression);

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }
        Engine.playEngine(data, task);
    }

    private static String[] makeProgression(int first, int step, int PROGRESSION_LENGHT) {
        String[] progression = new String[PROGRESSION_LENGHT];

        for (int i = 0; i < PROGRESSION_LENGHT; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }

        return progression;
    }
}

