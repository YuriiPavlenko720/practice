package Lesson05HomeWorkAnimals;

public class Reptile extends Animal {
    public Reptile() {
    }

    public Reptile(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("This animal can eat anything");
    }

    public void sleep() {
        System.out.println("This animal can sleep in holes");
    }

    public void move() {
        System.out.println("This animal can crawl");
    }

    public void bite() {
        System.out.println("This animal can bite");
    }
}
