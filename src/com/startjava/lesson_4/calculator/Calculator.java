package com.startjava.lesson_4.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char operation;
    String[] expression = new String[3];
    //TODO
    //- replace methods to Math - methods
    //- add String.split()
    //- add history in array
    public void scanExpression(String string) {
        this.expression = string.split(" ", 3);
        for (String i : expression) {
            System.out.println(i);
        }
    }
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
