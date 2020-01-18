import java.util.Scanner;


public class MyFirstGame {
    public static void main(String[] args) {
        int unknownNumber =(int) (Math.random()*100); //никогда не будет 100
        int x = 0;
//        System.out.println(unknownNumber);
        System.out.println ("Попробуйте угадать число от 0 до 100:");
        Scanner in = new Scanner(System.in);
        do {
            System.out.println ("Введите число: ");
            x = in.nextInt();
            if (x < unknownNumber) {
            System.out.println ("Введенное вами число меньше!");
            } else if (x > unknownNumber) {
            System.out.println ("Введенное вами число больше!");
            }
        } while (x != unknownNumber);
        System.out.println ("Поздравляем! Вы угадали!");
    }
}