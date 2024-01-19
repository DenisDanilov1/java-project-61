package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    public static final String task = "What number is missing in the progression?";
    public static final int MIN = 1;
    public static final int MAX = 30;
    private static final int PROGRESSION_LENGHT = 10;
    public static void progression() {
        String[][] data = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int stepProgression = Utils.generateNumber(MIN, MAX);
            int startProgression = Utils.generateNumber(MIN, MAX);
            int randIndex = Utils.generateNumber(MIN, PROGRESSION_LENGHT);
            String[] progression = new String[10];
            int num = startProgression;
            for (int j = 0; j < PROGRESSION_LENGHT; j++) {
                progression[j] = Integer.toString(num);
                num = num + stepProgression;
            }
            String correctAnswer = progression[randIndex];
            progression[randIndex] = "..";
            String question = String.join(" ", progression);


            data[i][0] = question;
            data[i][1] = correctAnswer;
        }
        Engine.engine(data, task);
    }
}
