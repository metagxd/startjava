import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Player 1, your name is: ");
        Player player1 = new Player(input.next());

        System.out.print("Player 2, your name is: ");
        Player player2 = new Player(input.next());

        GuessNumber newGame = new GuessNumber();

        newGame.startGame(player1, player2);
    }
}
