package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        var userNumber = sc.next();
        System.out.println("Your choice: " + userNumber);
        System.out.println(" ");
        switch (userNumber) {
            case "1":
                Cli.salutation();
                break;
            case "2":
                Even.playEven();
                break;
            case "3":
                Calculator.playCalc();
                break;
            case "4":
                GCD.playGCD();
                break;
            case "5":
                Progression.playProgression();
                break;
            case "6":
                Prime.playPrime();
                break;
            case "0":
                break;
            default:
                System.out.println("Your choice " + userNumber + " is not correct");
        }
    }
}
