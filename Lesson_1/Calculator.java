public class Calculator {
    public static void main(String[] args) {
        int x = 3;
        int y = 0;
        int res = 1;
        String op = "^";
        if (x > 0 && y > 0 ) {//проверка входных данных
            if (op.equals("+")) {
                res = x + y;
                System.out.println(res);
            } else if (op.equals("-")) {
                res = x-y;
                System.out.println(res);
            } else if (op.equals("*")) {
                res = x * y;
                System.out.println(res);
            } else if (op.equals("/")) {
                res = x / y;
                System.out.println(res);
            } else if (op.equals("^")) {
                for (int i = 1;i <= y ;i++) {//цикл возведения в степень
                    res *= x;
                }
                System.out.println(res);
            } else if (op.equals("%")) {
                res = x % y;
                System.out.println(res);
            }
        } else System.out.println("Error!");
    }
}