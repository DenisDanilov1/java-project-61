package hexlet.code;

import hexlet.code.Games.*;

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
        if (userNumber.equals("1")) {
            System.out.println("Your choice: " + userNumber);
            System.out.println("Welcome to the Brain Games!");
            Cli.salutation();
        }
        if (userNumber.equals("2")) {
            Even.even();
        }
        if (userNumber.equals("3")) {
            Calculator.calc();
        }
        if (userNumber.equals("4")){
            NOD.nod();
        }
        if (userNumber.equals("5")) {
           Progression.progression();
        }
        if (userNumber.equals("6")){
            Prime.prime();
        } else {
            System.out.println(" ");
        }
    }
}
