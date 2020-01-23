public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char operation;

    public void setFirstNumber(int firstNumber) {
        if (firstNumber <= 0) {
            System.out.println("Incorrect number!");
        } else {
            this.firstNumber = firstNumber;
        }
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        if (secondNumber <= 0) {
            System.out.println("Incorrect number!");
        } else {
            this.secondNumber = secondNumber;
        }
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setOperation(char operation) {
        if (!isOperationCorrect(operation)) {
            System.out.println("Incorrect math operation!");
        } else {
            this.operation = operation;
        }
    }

    public char getOperation() {
        return operation;
    }

    public  boolean isOperationCorrect(char operation) {
        return (operation == '+' || operation == '-' || operation == '*'
        || operation == '/' || operation == '%' || operation == '^');
    }

    public int calculate() {
        int result;

        switch(operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber - secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            case '^':
                result = 1;
                for (int i = 1; i <= secondNumber; i++) {//цикл возведения в степень
                    result *= firstNumber;
                }
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
