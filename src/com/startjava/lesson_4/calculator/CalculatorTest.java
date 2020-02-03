package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        int number = 0;
        String answer;
//TODO replace input method to string ex. 5+10;

    calculator.scanExpression(input.nextLine());


        // do {
        //     do {
        //         System.out.print("Type first number: ");
        //         if (input.hasNextInt()) {
        //             number = input.nextInt();
        //         } else {
        //             System.out.println("Error!");
        //             input.next();
        //         }
        //     } while (!calculator.setFirstNumber(number));
        //
        //     do {
        //         System.out.print("Type operation: ");
        //     } while (!(calculator.setOperation((input.next()).charAt(0))));
        //
        //     do {
        //         System.out.print("Type second number: ");
        //         if (input.hasNextInt()) {
        //             number = input.nextInt();
        //         } else {
        //             System.out.println("Error!");
        //             number = 0;
        //             input.next();
        //         }
        //     } while (!calculator.setSecondNumber(number));
        //     System.out.println("Result: " + calculator.calculate());
//TODO add history??
        //     do {
        //         System.out.print("Continue? [Yes/No]: ");
        //         answer = input.next();
        //         switch (answer) {
        //         case "No":
        //             System.out.println("Close...");
        //             break;
        //         case "Yes":
        //             break;
        //         default:
        //             System.out.println("Try again.");
        //             break;
        //         }
        //     } while (!("No".equals(answer) || "Yes".equals(answer)));
        // } while (!"No".equals(answer));
    }
}
