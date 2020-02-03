package com.startjava.lesson_4.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char operation;
    private String[] expression = new String[3];

    public boolean scanExpression(String string) {
        this.expression = string.split(" ", 3);
        if (Integer.parseInt(expression[0]) <= 0) {
            System.out.println("Incorrect first number!");
            return false;
        } else if (!(expression[1].charAt(0) == '+' || expression[1].charAt(0) == '-' || expression[1].charAt(0) == '*'
            || expression[1].charAt(0) == '/' || expression[1].charAt(0) == '%' || expression[1].charAt(0) == '^')) {
                System.out.println("Incorrect math operation!");
                return false;
        } else if (Integer.parseInt(expression[2]) <= 0) {
            System.out.println("Incorrect second number!");
            return false;
        }
        this.firstNumber = Integer.parseInt(expression[0]);
        this.operation = expression[1].charAt(0);
        this.secondNumber =Integer.parseInt(expression[2]);
        return true;
    }

    public int calculate() {
        int result;

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
                result =(int) Math.IEEEremainder(firstNumber, secondNumber);
                break;
            case '^':
                result =(int) Math.pow(firstNumber, secondNumber);
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
