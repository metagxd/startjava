package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        int number = 0;
        String answer;

        do {
            System.out.print("Type expression: ");
            while (!calculator.scanExpression(input.nextLine()));
            System.out.println("Result: " + calculator.calculate());
            do {
                System.out.print("Continue? [Yes/No]: ");
                answer = input.next();
                switch (answer) {
                case "No":
                    System.out.println("Close...");
                    break;
                case "Yes":
                    break;
                default:
                    System.out.println("Try again.");
                    break;
                }
            } while (!("No".equals(answer) || "Yes".equals(answer)));
            input.nextLine();
        } while (!"No".equals(answer));
    }
}
