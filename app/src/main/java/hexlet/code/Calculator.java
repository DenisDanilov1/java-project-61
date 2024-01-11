package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void calc() {
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
        for (int i = 1; i < 4;) {
            String[] operation = {" * ", " - ", " + "};
            Random random = new Random();
            int randIndex = random.nextInt(2);
            int random1 = random.nextInt(10);
            int random2 = random.nextInt(10);
            String operator = operation[randIndex];
            int result = 0;
            switch (operator) {
                case " * ":
                    result = random1 * random2;
                    break;
                case " - ":
                    result = random1 - random2;
                    break;
                case " + ":
                    result = random1 + random2;
                    break;
                default:
                    System.out.println("Выбран некорректный оператор");
            }
            System.out.println("Question: " + random1 + operator + random2);
            Scanner scan = new Scanner(System.in);
            var userNumber = scan.next();
            System.out.println("Your answer: " + userNumber);
            if (userNumber.equals(String.valueOf(result))) {
                System.out.println("Correct!");
                if (i == 3){
                    System.out.println("Congratulations, " + userName + "!");
                }
                i++;
            } else {
                System.out.println("'" + userNumber + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + userName + "!");
                i = 4;
            }
        }
    }
}
