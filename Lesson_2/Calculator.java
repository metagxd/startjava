public class Calculator {

    private int firstNumber = 0;
    private int secondNumber = 0;
    private char operation = '1';
    private int result = 0;

    public int calculation() {
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
      }
      return result;
    }

    public void setFirstNumber(int firstNumber) {
        if (firstNumber < 0) {
            System.out.println("Incorrect number!");
            System.exit(1);
        } else {
            this.firstNumber = firstNumber;
        }
    }

    public void setSecondNumber(int secondNumber) {
        if (firstNumber < 0) {
            System.out.println("Incorrect number!");
            System.exit(1);
        } else {
            this.secondNumber = secondNumber;
        }
    }

    public void setOperation(char operation) {
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/' && operation != '%' &&operation != '^') {
            System.out.println("Incorrect math operation!");
            System.exit(1);
        } else {
            this.operation = operation;
        }
    }
}
