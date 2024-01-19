package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class NOD {
    public static final String task = "Find the greatest common divisor of given numbers.";
    public static final int MIN = 1;
    public static final int MAX = 20;

    public static void nod() {
        String[][] data = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int random1 = Utils.generateNumber(MIN, MAX);
            int random2 = Utils.generateNumber(MIN, MAX);
            String str1 = String.valueOf(random1);
            String str2 = String.valueOf(random2);
            String question = str1 + " " + str2;
            String correctAnswer = String.valueOf(gcd(random1,random2));

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }
        Engine.engine(data, task);
    }

    private static int gcd(int random1, int random2) {
        int gcd = 1;
        for (int j = 1; j <= random1 && j <= random2; j++) {
            if (random1 % j == 0 && random2 % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }
}