package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        var userNumber = sc.next();
        System.out.println("Your choice: " + userNumber);
        System.out.println(" ");
        if (userNumber.equals("1")) {
            System.out.println("Your choice: " + userNumber);
            System.out.println("Welcome to the Brain Games!");
            Cli.main();
        }
        if (userNumber.equals("2")) {
            Game.sw();
        }
        else if (userNumber.equals("3")) {
                Calculator.calc();
        } else {
            System.out.println(" ");
        }
    }
}
