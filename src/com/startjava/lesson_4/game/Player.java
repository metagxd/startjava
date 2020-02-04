package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int attemptCount;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void resetData() {
        if (attemptCount > 0) {
        Arrays.fill(numbers, 0, attemptCount, 0);
        }
        attemptCount = 0;
    }

    public int getMaxCountOfAttempts() {
        return numbers.length;
    }

    public boolean isHaveAttempts() {
        return attemptCount < numbers.length;
    }

    public void addNumber(int number) {
        numbers[attemptCount] = number;
        attemptCount++;
    }

    public int getNumber() {
        return numbers[attemptCount-1];
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public String getListOfNumbers() {
        int[] enteredNumbers = Arrays.copyOf(numbers, attemptCount);
        String listOfNumber = "";
        for (int number : enteredNumbers) {
            listOfNumber += number + " ";
        }
        return listOfNumber;
    }
}
