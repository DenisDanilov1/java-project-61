package hexlet.code;

import hexlet.code.Games.Calculator;
import hexlet.code.Games.Game;
import hexlet.code.Games.Greet;
import hexlet.code.Games.NOD;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        var userNumber = sc.next();
        System.out.println("Your choice: " + userNumber);
        System.out.println(" ");
        if (userNumber.equals("1")) {
            System.out.println("Your choice: " + userNumber);
            System.out.println("Welcome to the Brain Games!");
            Cli.salutation();
        }
        if (userNumber.equals("2")) {
            Greet.greet();
        }
        if (userNumber.equals("3")) {
            Calculator.calc();
        }
        if (userNumber.equals("4")){
            NOD.nod();
        } else {
            System.out.println(" ");
        }
    }
}
