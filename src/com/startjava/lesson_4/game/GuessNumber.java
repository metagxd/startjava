package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int unknownNumber;
    private Scanner input  = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        reset();
        unknownNumber = (int) (Math.random() * 101);
        
        System.out.println("Guess number from 1 to 100.");
        System.out.println("Number of attempts: " + player1.getMaxCountOfAttempts());

        do {
            if (player1.isHaveAttempts()) {
                inputNumber(player1);
                if (compare(player1)) {
                    break;
                }
            }
            if (player2.isHaveAttempts()) {
                inputNumber(player2);
                if (compare(player2)) {
                    break;
                }
            }
            if (!player1.isHaveAttempts() && !player2.isHaveAttempts()) {
                System.out.println("Attempts is over!");
                break;
            }
        } while (true);
        showEnteredNumbers();
    }

    private void reset() {
        player1.resetAttempt();
        player1.resetNumbers();
        player2.resetAttempt();
        player2.resetNumbers();
    }

    private String getListOfNumbers(Player player) {
        String listOfnumbers = "";
        for (int number : player.getEnteredNumbers()) {
            listOfnumbers += number + " ";
        }
        return listOfnumbers;
    }

    private void showEnteredNumbers() {
        System.out.println(player1.getName() + "'s number: " + getListOfNumbers(player1));
        System.out.println(player2.getName() + "'s number: " + getListOfNumbers(player2));
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", your turn: ");
        player.addNumber(input.nextInt());
    }

    private boolean compare(Player player) {
        if (player.getNumber() == unknownNumber) {
            System.out.println("Congratulation! " + "Unknown number: " + unknownNumber
            + "\nThe winner is "  + player.getName() + ", with the " + player.getAttemptCount() + " attempt.");
            return true;
        } else if (player.getNumber() > unknownNumber) {
            System.out.println("Your number is bigger!");
        } else if (player.getNumber() < unknownNumber) {
            System.out.println("Your number is less!");
        }
        return false;
    }
}
