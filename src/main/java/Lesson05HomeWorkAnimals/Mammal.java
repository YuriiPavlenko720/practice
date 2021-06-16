package Lesson05HomeWorkAnimals;

public class Mammal extends Animal {
    public Mammal() {
    }

    public Mammal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("This animal can eat meat");
    }

    public void sleep() {
        System.out.println("This animal can sleep on the ground");
    }

    public void move() {
        System.out.println("This animal can run");
    }

    public void growl() {
        System.out.println("This animal can growl");
    }
}
