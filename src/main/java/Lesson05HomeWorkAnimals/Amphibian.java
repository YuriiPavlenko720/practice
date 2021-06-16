package Lesson05HomeWorkAnimals;

public class Amphibian extends Animal {
    public Amphibian() {
    }

    public Amphibian(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("This animal can eat insects");
    }

    public void sleep() {
        System.out.println("This animal can sleep anywhere");
    }

    public void move() {
        System.out.println("This animal can jump");
    }

    public void poison() {
        System.out.println("This animal can be poisonous");
    }
}
