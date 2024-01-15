package hexlet.code.Games;

import hexlet.code.Engine;


import java.math.BigInteger;
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
            } else {
                class IsPrime {
                    public boolean isPrime(int number) {
                        BigInteger bigInt = BigInteger.valueOf(number);
                        return bigInt.isProbablePrime(100);
                    }
                }
            }
            Engine.engine(questions, results, task);
        }
    }
}