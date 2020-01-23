import java.util.Scanner;

public class GuessNumber {

    private int count;

    public int getCount() {
        return count;
    }

    public void startGame() {
        int unknownNumber = (int) (Math.random() * 101);
        //System.out.println(unknownNumber);
        System.out.println("guess a number from 0 to 100!");
        Scanner input = new Scanner(System.in);
        int supposedNumber;
        do {
            System.out.println("Type a number and press 'Enter': ");
            count++;
            supposedNumber = input.nextInt();
            if (supposedNumber < unknownNumber) {
                System.out.println("Typed number is less!");
            } else if (supposedNumber > unknownNumber) {
                System.out.println("Typed number is bigger!");
            }
        } while (supposedNumber != unknownNumber);
        System.out.println("Right, the number is: " + unknownNumber);
    }
}
