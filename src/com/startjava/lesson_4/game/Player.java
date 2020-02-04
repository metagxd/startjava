package com.startjava.lesson_4.game;

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

    public int getNumber() {
        return numbers[attemptCount-1];
    }

    public void addNumber(int number) {
        while (true) {
            if (attemptCount == numbers.length - 1) {
                System.out.println("Attempts is over!");
                break;
            }
            numbers[attemptCount] = number;
            attemptCount++;
            break;
        }
    }
}
