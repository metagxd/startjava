package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;

        System.out.print("Player 1, your name is: ");
        Player player1 = new Player(input.next());

        System.out.print("Player 2, your name is: ");
        Player player2 = new Player(input.next());

        GuessNumber game = new GuessNumber(player1, player2);

        do {
            game.start();
            do {
                System.out.print("Once again? [Yes/No]: ");
                answer = input.next();
                switch (answer) {
                case "No":
                    System.out.println("Close...");
                    break;
                case "Yes":
                    break;
                default:
                    System.out.println("Try again.");
                    break;
                }
            } while (!("No".equals(answer) || "Yes".equals(answer)));
        } while (!("No".equals(answer)));
    }
}
