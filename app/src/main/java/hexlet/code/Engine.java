package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;
    public static void engine(String[][] data, String task) {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(task);
        for (String[] arr : data) {
                System.out.println("Question: " + arr[0]);
                Scanner scan = new Scanner(System.in);
                var userNumber = scan.next();
                System.out.println("Your answer: " + userNumber);
            if (userNumber.equals(arr[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userNumber + "' is wrong answer ;(. Correct answer was '" + arr[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
