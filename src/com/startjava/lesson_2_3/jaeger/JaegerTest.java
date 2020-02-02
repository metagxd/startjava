package com.startjava.lesson_2_3.jaeger;

public class JaegerTest{

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();

        jaeger1.setName("Striker Eureka");
        jaeger2.setName("Bracer Phoenix");
        jaeger1.setMark("Mark-5");
        jaeger2.setMark(jaeger1.getMark());
        jaeger1.setOrigin("Australia");
        jaeger2.setOrigin("China");
        jaeger1.setHeight(76);
        jaeger2.setHeight(jaeger1.getHeight());
        jaeger1.setWeight(1850);
        jaeger2.setWeight(2128);
        jaeger1.setSpeed(10);
        jaeger2.setSpeed(9);
        jaeger1.setStrenght(9);
        jaeger2.setStrenght(jaeger1.getStrenght());
        jaeger1.setArmor(9);
        jaeger2.setArmor(10);

        System.out.println("Jaeger 1:" + "\nName: " + jaeger1.getName() + "\nMark: " +
        jaeger1.getMark() + "\nOrigin: " + jaeger1.getOrigin() + "\nHeight: " +
        jaeger1.getHeight() + "\nWeight: " + jaeger1.getWeight() + "\nSpeed: " +
        jaeger1.getSpeed() + "\nSternght: " + jaeger1.getStrenght() + "\nArmor: " +
        jaeger1.getArmor());

        System.out.println("\nJaeger 2:" + "\nName: " + jaeger2.getName() + "\nMark: " +
        jaeger2.getMark() + "\nOrigin: " + jaeger2.getOrigin() + "\nHeight: " +
        jaeger2.getHeight() + "\nWeight: " + jaeger2.getWeight() + "\nSpeed: " +
        jaeger2.getSpeed() + "\nSternght: " + jaeger2.getStrenght() + "\nArmor: " +
        jaeger2.getArmor());

        jaeger2.setWeight(2000);
        System.out.println(jaeger2.getName() + " weight: " + jaeger2.getWeight());

        jaeger1.setSpeed(8);
        System.out.println(jaeger1.getName() + " speed: " + jaeger1.getSpeed());
    }
}
