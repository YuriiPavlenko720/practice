package Lesson05HomeWorkAnimals;

public class Bird extends Animal {
    public Bird() {
    }

    public Bird(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("This animal can eat grains");
    }

    public void sleep() {
        System.out.println("This animal can sleep in nests");
    }

    public void move() {
        System.out.println("This animal can fly");
    }

    public void sing() {
        System.out.println("This animal can sing");
    }
}
