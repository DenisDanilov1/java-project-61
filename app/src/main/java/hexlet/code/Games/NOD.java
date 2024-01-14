package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class NOD {
    public static void nod() {
        String task = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[3];
        String[] results = new String[3];
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int random1 = random.nextInt(100);
            int random2 = random.nextInt(100);
            String str1 = String.valueOf(random1);
            String str2 = String.valueOf(random2);
            questions[i] = str1 + " " + str2;
            int gcd = 1;
            for (int j = 1; i <= random1 && j <= random2; j++) {
                if (random1 % j == 0 && random2 % j == 0) {
                    gcd = j;
                }
            }
            results[i] = String.valueOf(gcd);
            }
        Engine.engine(questions, results, task);
        }
    }
