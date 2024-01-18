package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void even() {
        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String [] questions = new String[3];
        String [] results = new String[3];
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int random1 = random.nextInt(100);
            questions[i] = String.valueOf(random1);
            String answer = (random1 % 2 == 0) ? (results[i] = "yes") : (results[i] = "no");
        }
        Engine.engine(questions, results, task);
    }
}
