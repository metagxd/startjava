import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Scanner input  = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int unknownNumber = (int) (Math.random() * 101);
        int supposedNumber;
        
        System.out.println("Guess number from 1 to 100.");
        do {
            //System.out.println(unknownNumber);
            System.out.print(player1.getName() + ", your turn: ");
            player1.setNumber(input.nextInt());
            supposedNumber = player1.getNumber();
            compare(unknownNumber, supposedNumber);
            if (supposedNumber != unknownNumber) {
                System.out.print(player2.getName() + ", your turn: ");
                player2.setNumber(input.nextInt());
                supposedNumber = player2.getNumber();
                compare(unknownNumber, supposedNumber);
            }
        } while (supposedNumber != unknownNumber);
        if (player1.getNumber() == supposedNumber) {
            System.out.println("Congratulation! " + "Unknown number: " + unknownNumber
            + "\nThe winner is "  + player1.getName());
        } else{
            System.out.println("Congratulation! " + "Unknown number: " + unknownNumber
            + "\nThe winner is "  + player2.getName());
        }
    }

    private void compare(int unknownNumber, int supposedNumber) {
        if (supposedNumber < unknownNumber) {
            System.out.println("Your number is less!");
        } else if (supposedNumber > unknownNumber) {
            System.out.println("Your number is bigger!");
        }
    }
}
