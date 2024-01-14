package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        String task = "What number is missing in the progression?";
        String[] questions = new String[3];
        String[] results = new String[3];
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int stepProgression = random.nextInt(10);
            int startProgression = random.nextInt(100);
            int randIndex = random.nextInt(10);
            String[] progression = new String[10];
            int num = startProgression;
            for (int j = 0; j < 10; j++) {
                progression[j] = Integer.toString(num);
                num = num + stepProgression;
            }
            results[i] = progression[randIndex];
            progression[randIndex] = "..";
            questions[i] = String. join (" ", progression);
        }
        Engine.engine(questions, results, task);
    }
}
