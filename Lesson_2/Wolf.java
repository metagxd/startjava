public class Wolf {

    private String name = "Rocket";
    private String gender = "male";
    private int age = 6;
    private int weight = 76;
    private String color = "black";

    public void walk() {

    }

    public boolean run() {
        return true;
    }

    public void seat() {

    }

    public boolean howl() {
        return true;
    }

    public String hunt() {
        return "Searching...";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect value!");
        } else {
            this.age = age;
        }
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}