import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int unknownNumber;
    private int inputNumber;
    private Scanner input  = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        unknownNumber = (int) (Math.random() * 101);

        System.out.println("Guess number from 1 to 100.");
            // do {
            // } while (true);
            while (true) {
                //System.out.println(unknownNumber);
                scanNumber(player1);
                compare(player1);
                if (inputNumber != unknownNumber) {
                    scanNumber(player2);
                    compare(player2);
                }
                if (inputNumber == unknownNumber) {
                    break;
                }
            }
    }

    private void compare(Player player) {
        if (player.getNumber() < unknownNumber) {
            System.out.println("Your number is less!");
        } else if (player.getNumber() > unknownNumber) {
            System.out.println("Your number is bigger!");
        } else if (player.getNumber() == unknownNumber) {
            System.out.println("Congratulation! " + "Unknown number: " + unknownNumber
            + "\nThe winner is "  + player.getName());
        }
    }

    private void scanNumber(Player player) {
        System.out.print(player.getName() + ", your turn: ");
        player.setNumber(input.nextInt());
        inputNumber = player.getNumber();
    }
}
