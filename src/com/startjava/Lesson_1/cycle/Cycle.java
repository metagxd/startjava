package com.startjava.lesson_1.cycle;

public class Cycle {
    public static void main(String[] args) {
        System.out.println("Numbers from 0 to 20:");
        for (int i = 0; i <= 20 ; i++) {
            System.out.println(i);
        }

        System.out.println("\nNumbers from 6 to -6 (step 2):");
        int j = 6;
        while (j >= -6) {
            System.out.println(j);
            j -= 2;
        }

        System.out.print("\nSum of all odd numbers from 10 to 20: ");
        int k = 10;
        int sum = 0;
        do {
            if (k % 2 != 0) {
                sum += k;
            }
            k++;
        } while(k <= 20);
        System.out.print(sum);
    }
}
