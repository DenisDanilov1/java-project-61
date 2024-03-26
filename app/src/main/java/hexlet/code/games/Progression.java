package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final String TASK = "What number is missing in the progression?";
    public static final int MIN = 1;
    public static final int MAX = 20;
    public static final int PROGRESSION_LENGHT = 10;

    public static void playProgression() {
        String[][] data = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int progressionLenght = PROGRESSION_LENGHT;
            int step = Utils.generateNumber(MIN, MAX);
            int first = Utils.generateNumber(MIN, MAX);
            int randIndex = Utils.generateNumber(0, progressionLenght - 1);
            String[] progression = makeProgression(first, step, progressionLenght);
            String correctAnswer = progression[randIndex];
            progression[randIndex] = "..";
            String question = String.join(" ", progression);

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }
        Engine.playEngine(data, TASK);
    }

    private static String[] makeProgression(int first, int step, int progressionLenght) {
        String[] progression = new String[progressionLenght];

        for (int i = 0; i < progressionLenght; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }

        return progression;
    }
}
