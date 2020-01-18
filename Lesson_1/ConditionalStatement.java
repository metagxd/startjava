public class ConditionalStatement {
    public static void main(String[] args) {
        String name = "Artyom";
        int age = 26;
        String sex = "male";
        int height = 175;
        if (age > 20) {
            System.out.println("Вам больше 20.");
        }
        if (sex.equals("male")){
            System.out.println("Вы мужчина.");
        }
        if (!sex.equals("male")){
            System.out.println("Вы женщина.");
        }
        if (height < 180) {
            System.out.println("Вы не высокий.");
        } else {
            System.out.println("Вы высокий.");
        }
        if (name.charAt(0) == 'M') {
            System.out.println("Вы, возможно, Максим.");
        } else if (name.charAt(0) == 'I') {
            System.out.println("Вы, возможно, Иван.");
        } else System.out.println("Кто вы?");
    }
}