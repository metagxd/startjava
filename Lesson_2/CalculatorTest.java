import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator firstCalculation = new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.print("Type first number: ");
        firstCalculation.setFirstNumber(input.nextInt());

        System.out.print("Type operation: ");
        firstCalculation.setOperation((input.next()).charAt(0));

        System.out.print("Type second number: ");
        firstCalculation.setSecondNumber(input.nextInt());
        String answer = "No";
        do {
            System.out.print("Continue? [Yes/No]: ");
            answer = input.next();
            switch (answer) {
                case "No":
                System.out.println("Aborting...");
                System.exit(1);
                case "Yes":
                answer = "Yes";
                break;
            }
        } while (!("Yes").equals(answer));
        System.out.println("Result: " + firstCalculation.calculation());
    }
}
