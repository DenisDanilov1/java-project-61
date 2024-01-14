package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void engine(String[] questions, String[] results, String task) {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(task);
        for (int i = 0; i < 3;) {
            System.out.println("Question: " + questions[i]);
            Scanner scan = new Scanner(System.in);
            var userNumber = scan.next();
            System.out.println("Your answer: " + userNumber);
            if (userNumber.equals(String.valueOf(results[i]))) {
                System.out.println("Correct!");
                if (i == 2){
                    System.out.println("Congratulations, " + userName + "!");
                }
                    i++;
            } else {
                System.out.println("'" + userNumber + "' is wrong answer ;(. Correct answer was '" + results[i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                i = 3;
            }
        }
    }
}
