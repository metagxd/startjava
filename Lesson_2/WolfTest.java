public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.name = "Axe";
        wolfOne.weight = 50;
        wolfOne.age = 2;
        wolfOne.color = "white";
        wolfOne.gender = "female";

        System.out.println("We found wolf, we call it " + wolfOne.name + ".\nIt wolf is " + wolfOne.age + " years old, " + 
        wolfOne.color + " color, it weight is " + wolfOne.weight + ", and whe shure that it " + wolfOne.gender + ".");

        if (wolfOne.howl()) {
            System.out.println(wolfOne.hunt());
        }

        if (wolfOne.run()) {
            System.out.println ("Watch out!");
        }
    }
}