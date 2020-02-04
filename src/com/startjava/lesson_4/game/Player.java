package com.startjava.lesson_4.game;

public class Player {

    private String name;
    private int number;
    private int[] numbers = new int[10];
    private int attemptCount;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void addNumber(int number) {
        while (true) {
            if (attemptCount == numbers.length - 1) {
                System.out.println("Attempts is over!");
                break;
            }
            numbers[attemptCount] = number;
        }
    }
}
