package hexlet.code;

import java.util.Scanner;

public class Game {
    public static void sw() {
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: 15");
        Scanner scan = new Scanner(System.in);
        var userNumber = scan.next();
        if (userNumber.equals("yes") | userNumber.equals("no")){
            System.out.println("Your answer: no");
            if (userNumber.equals("no")) {
                System.out.println("Correct!");
            }
            System.out.println("Question: 6");
            Scanner sc1 = new Scanner(System.in);
            String userNumber1 = sc1.next();
            System.out.println("Your answer: yes");
            if (userNumber1.equals("yes")) {
                System.out.println("Correct!");
            }
            System.out.println("Question: 7");
            Scanner sc2 = new Scanner(System.in);
            String userNumber2 = sc2.next();
            System.out.println("Your answer: no");
            if (userNumber2.equals("no")) {
                System.out.println("Correct!");
                System.out.println("Congratulations, " + userName + "!");
            }
        } else {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
