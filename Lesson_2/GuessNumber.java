import java.util.Scanner;

public class GuessNumber {

    private int count;

    public int getCount() {
        return count;
    }

    public void startGame(Player player1, Player player2) {
        Scanner input = new Scanner(System.in);

        System.out.print(player1.getName() + ", guess number: ");
        player1.setNumber(input.nextInt());

        game(player1.getNumber());
        player1.setAttempts(count);

        System.out.print(player2.getName() + ", guess number: ");
        player2.setNumber(input.nextInt());

        game(player2.getNumber());
        player2.setAttempts(count);

        if (player1.getAttempts() < player2.getAttempts()) {
            System.out.println("Congratulation! The winner is :" + player1.getName());
        } else if (player1.getAttempts() > player2.getAttempts()) {
            System.out.println("Congratulation! The winner is :" + player2.getName());
        } else {
            System.out.println("Congratulation! Tie!");
        }
    }

    private void game(int number) {
        int unknownNumber = (int) (Math.random() * 101);
        //System.out.println(unknownNumber);
        Scanner input = new Scanner(System.in);
        int supposedNumber = number;
        count = 1;
        while (supposedNumber != unknownNumber) {
            count++;
            if (supposedNumber < unknownNumber) {
                System.out.println("Your number is less!");
            } else if (supposedNumber > unknownNumber) {
                System.out.println("Your number is bigger!");
            }
            supposedNumber = input.nextInt();
        }
        System.out.println("Right, the number is: " + unknownNumber + "\nNumber of attemts: "
        + count);
    }
}
