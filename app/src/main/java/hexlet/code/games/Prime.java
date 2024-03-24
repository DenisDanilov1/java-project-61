package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MIN = 1;
    public static final int MAX = 100;

    public static void playPrime() {
        String[][] data = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int random = Utils.generateNumber(MIN, MAX);
            String question = Integer.toString(random);
            String correctAnswer =  isPrime(random) ? "yes" : "no";

            data[i][0] = question;
            data[i][1] = correctAnswer;
        }
        Engine.playEngine(data, TASK);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
