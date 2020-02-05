package com.startjava.lesson_4.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char operation;

    public boolean splitExpression(String string) {
        String[] expression = string.split(" ", 3);
        char operation = expression[1].charAt(0);
        if (Integer.parseInt(expression[0]) <= 0) {
            System.out.println("Incorrect first number!");
            return false;
        } else if (!(operation == '+' || operation == '-' || operation == '*'
            || operation == '/' || operation == '%' || operation == '^')) {
                System.out.println("Incorrect math operation!");
                return false;
        } else if (Integer.parseInt(expression[2]) <= 0) {
            System.out.println("Incorrect second number!");
            return false;
        }
        firstNumber = Integer.parseInt(expression[0]);
        this.operation = operation;
        secondNumber = Integer.parseInt(expression[2]);
        return true;
    }

    public int calculate() {
        int result = 0;

        switch(operation) {
            case '+':
                result = Math.addExact(firstNumber, secondNumber);
                break;
            case '-':
                result = Math.subtractExact(firstNumber, secondNumber);
                break;
            case '*':
                result = Math.multiplyExact(firstNumber, secondNumber);
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '%':
                result = (int) Math.IEEEremainder(firstNumber, secondNumber);
                break;
            case '^':
                result = (int) Math.pow(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Calculation error!");
                break;
        }
        return result;
    }
}
