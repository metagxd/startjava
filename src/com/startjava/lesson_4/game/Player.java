package com.startjava.lesson_4.game;

public class Player {

    private String name;
    private int[] numbers = new int[5];
    private int attemptCount;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxCountOfAttempts() {
        return numbers.length;
    }

    public boolean isHaveAttempts() {
        if (attemptCount < numbers.length) {
            return true;
        }
        return false;
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
        String numbers = "";
        for (int i = 0; i < attemptCount; i++) {
            numbers += this.numbers[i] + " ";
        }
        return "Entered numbers: " + numbers;
    }
}
