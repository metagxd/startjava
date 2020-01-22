import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.print("Type first number: ");
        calculator.setFirstNumber(input.nextInt());

        System.out.print("Type operation: ");
        calculator.setOperation((input.next()).charAt(0));

        System.out.print("Type second number: ");
        calculator.setSecondNumber(input.nextInt());
        String answer = "";
        do {
            System.out.print("Continue? [Yes/No]: ");
            answer = input.next();
            switch (answer) {
                case "No":
                    System.out.println("Aborting...");
                    break;
                case "Yes":
                    answer = "Yes";
                    System.out.println("Result: " + calculator.calculate());
                    break;
                default:
                    System.out.println("Try again.");
                    break;
            }
        } while (!("Yes".equals(answer) | "No".equals(answer)));
    }
}
