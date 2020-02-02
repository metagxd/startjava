package com.startjava.lesson_2_3.wolf;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setName("Axe");
        wolfOne.setWeight(50);
        wolfOne.setAge(2);
        wolfOne.setColor("white");
        wolfOne.setGender("female");

        System.out.println("We found wolf, we call it " + wolfOne.getName() + ".\nIt wolf is " + wolfOne.getAge() + " years old, " +
        wolfOne.getColor() + " color, it weight is " + wolfOne.getWeight() + ", and whe shure that it " + wolfOne.getGender() + ".");

        if (wolfOne.howl()) {
            System.out.println(wolfOne.hunt());
        }

        if (wolfOne.run()) {
            System.out.println("Watch out!");
        }

        wolfOne.setAge(17);
    }
}
