package cz.educanet;

import java.util.Scanner;

public class CalculatorCLI {

    Scanner sc = new Scanner(System.in);
    Operations op = new Operations();

    public void mainMenu() {
        System.out.println("Welcome in calculator 2.0");
        System.out.println("1. Enter Calculator");
        System.out.println("2. Exit");
        int mainChoice = sc.nextInt();
        while (mainChoice == 1) {
            System.out.println("1. Plus");
            System.out.println("2. Minus");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Pow");
            System.out.println("6. Factorial");
            System.out.println("7. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Please choose two numbers: ");
                System.out.println(op.getPlus(sc.nextInt(), sc.nextInt()));
            } else if (choice == 2) {
                System.out.println("Please choose two numbers: ");
                System.out.println(op.getMinus(sc.nextInt(), sc.nextInt()));
            } else if (choice == 3) {
                System.out.println("Please choose two numbers: ");
                System.out.println(op.getMultiply(sc.nextInt(), sc.nextInt()));
            } else if (choice == 4) {
                System.out.println("Please choose two numbers: ");
                System.out.println(op.getDivide(sc.nextDouble(), sc.nextDouble()));
            } else if (choice == 5) {
                System.out.println("Please choose two numbers: ");
                System.out.println(op.getPow(sc.nextDouble(), sc.nextDouble()));
            } else if (choice == 6) {
                System.out.println("Please choose length of factorial: ");
                System.out.println(op.getFactorial(sc.nextInt()));
            } else if (choice == 7) {
                System.out.println("See you soon!");
                break;
            }
        }
        if (mainChoice == 2) {
            System.out.println("See you soon!");
        }
    }
}
