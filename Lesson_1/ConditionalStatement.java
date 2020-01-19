public class ConditionalStatement {
    public static void main(String[] args) {

        int age = 26;
        if (age > 20) {
            System.out.println("You're over 20 years old.");
        }

        boolean isMan = true;
        if (isMan) {
            System.out.println("You're a man.");
        } else {
            System.out.println("You're a woman.");
        }

        int height = 175;
        if (height < 180) {
            System.out.println("You're not tall.");
        } else {
            System.out.println("You're tall.");
        }

        String name = "Artyom";
        if (name.charAt(0) == 'M') {
            System.out.println("You, probably, Max.");
        } else if (name.charAt(0) == 'I') {
            System.out.println("You, probably, Ivan.");
        } else System.out.println("Who are you?");
    }
}