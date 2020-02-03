package com.startjava.lesson_4.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char operation;

    public boolean setFirstNumber(int firstNumber) {
        if (firstNumber <= 0) {
            System.out.println("Incorrect number!");
            return false;
        }
        this.firstNumber = firstNumber;
        return true;
    }

    public boolean setSecondNumber(int secondNumber) {
        if (secondNumber <= 0) {
            System.out.println("Incorrect number!");
            return false;
        }
        this.secondNumber = secondNumber;
        return true;
    }

    public boolean setOperation(char operation) {
        if (!(operation == '+' || operation == '-' || operation == '*'
            || operation == '/' || operation == '%' || operation == '^')) {
            System.out.println("Incorrect math operation!");
            return false;
        }
        this.operation = operation;
        return true;
    }

    public int calculate() {
        int result;

        switch(operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            case '^':
                result = 1;
                for (int i = 1; i <= secondNumber; i++) {//цикл возведения в степень
                    result *= firstNumber;
                }
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
