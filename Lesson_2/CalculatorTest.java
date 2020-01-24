import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Type first number: ");
        } while (!(calculator.setFirstNumber(input.nextInt())));

        do {
            System.out.print("Type operation: ");
        } while (!(calculator.setOperation((input.next()).charAt(0))));

        do {
            System.out.print("Type second number: ");
        } while (!(calculator.setSecondNumber(input.nextInt())));

        String answer;
            do {
                System.out.print("Continue? [Yes/No]: ");
                answer = input.next();
                switch (answer) {
                    case "No":
                        System.out.println("Aborting...");
                        break;
                    case "Yes":
                        System.out.println("Result: " + calculator.calculate());
                        break;
                    default:
                        System.out.println("Try again.");
                        break;
                }
            } while (!("Yes".equals(answer) || "No".equals(answer)));
    }
}
