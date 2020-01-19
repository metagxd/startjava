public class Cycle {
    public static void main(String[] args) {
        System.out.println("Numbers from 0 to 20: ");
        for (int i = 0; i <= 20 ; i++) {
            System.out.println(i);
        }
        System.out.println("Numbers from 6 to -6 (step 2): ");
        int j = 6;
        while (j >= -6) {
            System.out.println(j);
            j-=2;
        }
        int k = 10;
        int res = 0;
        System.out.println("Odd numbers from 10 to 20: ");
        do {
            if (k%2!=0) {
                System.out.println(k);
            }
            k+=1;
        } while(k <= 20);
    }
}