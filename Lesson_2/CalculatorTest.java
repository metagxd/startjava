import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        int value = 0;

        do {
            System.out.print("Type first number: ");
            String number = input.next();
            while (!calculator.isInt(number)) {
                System.out.print("Error! Not a numeric! Try again: ");
                number = input.next();
            }
            if (calculator.isInt(number)) {
                value = Integer.parseInt(number);
            }
        } while (!(calculator.setFirstNumber(value)));

        do {
            System.out.print("Type operation: ");
        } while (!(calculator.setOperation((input.next()).charAt(0))));

        do {
            System.out.print("Type second number: ");
            String number = input.next();
            while (!calculator.isInt(number)) {
                System.out.print("Error! Not a numeric! Try again: ");
                number = input.next();
            }
            if (calculator.isInt(number)) {
                value = Integer.parseInt(number);
            }
        } while (!(calculator.setSecondNumber(value)));

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
