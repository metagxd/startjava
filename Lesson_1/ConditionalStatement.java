public class ConditionalStatement {
    public static void main(String[] args) {
        String name = "Artyom";
        int age = 26;
        String sex = "male";
        int height = 175;
        if (age > 20) {
            System.out.println("You're over 20 years old.");
        }
        if (sex.equals("male")){
            System.out.println("You're a man.");
        }
        if (!sex.equals("male")){
            System.out.println("You're a woman.");
        }
        if (height < 180) {
            System.out.println("You're not tall.");
        } else {
            System.out.println("You're tall.");
        }
        if (name.charAt(0) == 'M') {
            System.out.println("You, probably, Max.");
        } else if (name.charAt(0) == 'I') {
            System.out.println("You, probably, Ivan.");
        } else System.out.println("Who are you?");
    }
}