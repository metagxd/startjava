public class Calculator {

    private int firstNumber = 0;
    private int secondNumber = 0;
    private char operation = '1';

    public void setFirstNumber(int firstNumber) {
        if (firstNumber < 0) {
            System.out.println("Incorrect number!");
        } else {
            this.firstNumber = firstNumber;
        }
    }

    public void setSecondNumber(int secondNumber) {
        if (firstNumber < 0) {
            System.out.println("Incorrect number!");
        } else {
            this.secondNumber = secondNumber;
        }
    }

    public void setOperation(char operation) {
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/' && operation != '%' &&operation != '^') {
            System.out.println("Incorrect math operation!");
        } else {
            this.operation = operation;
        }
    }

    public int calculate() {
        int result = 0;
        
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
