package hexlet.code.Games;

import hexlet.code.Engine;
import java.util.Arrays;

import java.util.Random;

public class Prime {
    public static void prime() {
        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[3];
        String[] results = new String[3];
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int random1 = random.nextInt(100);
            String str1 = String.valueOf(random1);
            questions[i] = str1;
            if (random1 < 2) {
                results[i] = "no";
            }
            int[] simple = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
            if (Arrays.asList(simple).contains(random1)) {
                results[i] = "yes";
            } else {
                results[i] = "no";
            }
        }
        Engine.engine(questions, results, task);
    }
}
