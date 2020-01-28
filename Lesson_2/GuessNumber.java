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
        System.out.print(player1.getName() + ", guess number: ");
        player1.resetAttempts();
        player1.setNumber(input.nextInt());
        play(player1);
        System.out.print(player2.getName() + ", guess number: ");
        player2.resetAttempts();
        player2.setNumber(input.nextInt());
        play(player2);
        if (player1.getAttempts() < player2.getAttempts()) {
            System.out.println("Congratulation! The winner is :" + player1.getName());
        } else if (player1.getAttempts() > player2.getAttempts()) {
            System.out.println("Congratulation! The winner is :" + player2.getName());
        } else {
            System.out.println("Congratulation! Tie!");
        }
    }

    private void play(Player player) {
        int unknownNumber = (int) (Math.random() * 101);
        System.out.println(unknownNumber);
        int supposedNumber = player.getNumber();
        while (supposedNumber != unknownNumber) {
            player.setAttempts();
            if (supposedNumber < unknownNumber) {
                System.out.println("Your number is less!");
            } else if (supposedNumber > unknownNumber) {
                System.out.println("Your number is bigger!");
            }
            supposedNumber = input.nextInt();
        }
        System.out.println("Right, the number is: " + unknownNumber + "\nNumber of attemts: "
        + player.getAttempts());
    }
}
