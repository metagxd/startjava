package com.startjava.lesson_4.arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int [] numbers;
        numbers = new int[]{10, -3, 35, 3, 43, -56, 34, 22, 96, 23,};
        int evenSum = 0;

        //sum of all pos. even number
        for (int number:numbers) {
            if (number > 0 && number % 2 == 0) evenSum += number;
        }
        System.out.println(evenSum);

        //bubble sort.
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length-1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    isSorted = false;
                    buffer = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = buffer;
                }
            }
        }
        for (int number:numbers) {
            System.out.print(number + "| ");
        }
    }
}
