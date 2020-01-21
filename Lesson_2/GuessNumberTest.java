import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Player 1, your name is: ");
        Player player1 = new Player(input.next());

        System.out.print("Player 2, your name is: ");
        Player player2 = new Player(input.next());

        System.out.print("\n" + player1.getName() + ", ");
        GuessNumber player1Game = new GuessNumber();
        player1Game.startGame();
        System.out.println("Number of attempts: " + player1Game.getCount());

        System.out.print("\nNow, " + player2.getName() + ", ");
        GuessNumber player2Game = new GuessNumber();
        player2Game.startGame();
        System.out.println("Number of attempts: " + player2Game.getCount());

        if (player1Game.getCount() < player2Game.getCount()) {
            System.out.println("Congratulation! The winner is :" + player1.getName());
        } else if (player1Game.getCount() > player2Game.getCount()) {
            System.out.println("Congratulation! The winner is :" + player2.getName());
        } else {
            System.out.println("Congratulation! Tie!");
        }
    }
}
