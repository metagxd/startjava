public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 26;
        if (age > 20) {
            System.out.println("You're over 20 years old.");
        }

        boolean isMan = true;
        if (isMan) {
            System.out.println("You're a man.");
        }
        if (!isMan) {
            System.out.println("You're a woman.");
        }

        int height = 175;
        if (height < 180) {
            System.out.println("You're not tall.");
        } else {
            System.out.println("You're tall.");
        }

        char firstNameLetter = "Artyom".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("You, probably, Max.");
        } else if (firstNameLetter == 'I') {
            System.out.println("You, probably, Ivan.");
        } else System.out.println("Who are you?");
    }
}