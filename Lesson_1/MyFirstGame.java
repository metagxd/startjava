import java.util.Scanner;


public class MyFirstGame {
    public static void main(String[] args) {
        int unknownNumber =(int) (Math.random()*101);
        int suposedNumber = 0;
        System.out.println(unknownNumber);
        System.out.println("Guess a number from 0 to 100:");
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Type a number and press 'Enter': ");
            suposedNumber = in.nesuposedNumbertInt();
            if (suposedNumber < unknownNumber) {
                System.out.println("Typed number is less!");
            } else if (suposedNumber > unknownNumber) {
                System.out.println("Typed number is bigger!");
            }
        } while (suposedNumber != unknownNumber);
        System.out.println("Congratulation! You won! The number is: " + unknownNumber);
    }
}