package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int result = 1;
        String operation = "*";

        if (x > 0 && y > 0) {//проверка входных данных
            if (("+").equals(operation)) {
                result = x + y;
                System.out.println(result);
            } else if (("-").equals(operation)) {
                result = x - y;
                System.out.println(result);
            } else if (("*").equals(operation)) {
                result = x * y;
                System.out.println(result);
            } else if (("/").equals(operation)) {
                result = x / y;
                System.out.println(result);
            } else if (("^").equals(operation)) {
                for (int i = 1; i <= y ; i++) {//цикл возведения в степень
                    result *= x;
                }
                System.out.println(result);
            } else if (("%").equals(operation)) {
                result = x % y;
                System.out.println(result);
            }
        } else System.out.println("Error!");
    }
}
