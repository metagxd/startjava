package com.startjava.lesson_4.calculator;

public class Calculator {
    
    private int firstNumber;
    private int secondNumber;
    private char operation;
    
    public boolean splitExpression(String srcExpression) {
        String[] expression = srcExpression.split(" ");
        
        if (!setFirstNumber(Integer.parseInt(expression[0]))) {
            System.out.println("Incorrect first number!");
            return false;
        } else if (!setOperation(expression[1].charAt(0))) {
            System.out.println("Incorrect math operation");
            return false;
        } else if (!setSecondNumber(Integer.parseInt(expression[2]))) {
            System.out.println("Incorrect second number!");
            return false;
        }
        return true;
    }

    private boolean setFirstNumber(int firstNumber) {
        if (firstNumber < 0) {
            return false;
        }
        this.firstNumber = firstNumber;
        return true;
    }

    private boolean setOperation(char operation) {
        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%'
                || operation == '^')) {
            return false;
        }
        this.operation = operation;
        return true;
    }

    private boolean setSecondNumber(int secondNumber) {
        if (secondNumber < 0) {
            return false;
        }
        this.secondNumber = secondNumber;
        return true;
    }

    public int calculate() {
        int result = 0;

        switch (operation) {
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
