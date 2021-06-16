package Lesson05HomeWorkAnimals;

public class Application {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Human");
        animal1.info();
        animal1.live();
        animal1.eat();
        animal1.move();
        animal1.sleep();
        System.out.println("==============");
        Fish animal2 = new Fish("Shark");
        animal2.info();
        animal2.live();
        animal2.eat();
        animal2.move();
        animal2.sleep();
        animal2.breathe();
        System.out.println("==============");
        Amphibian animal3 = new Amphibian("Frog");
        animal3.info();
        animal3.live();
        animal3.eat();
        animal3.move();
        animal3.sleep();
        animal3.poison();
        System.out.println("==============");
        Bird animal4 = new Bird("Sparrow");
        animal4.info();
        animal4.live();
        animal4.eat();
        animal4.move();
        animal4.sleep();
        animal4.sing();
        System.out.println("==============");
        Reptile animal5 = new Reptile("Crocodile");
        animal5.info();
        animal5.live();
        animal5.eat();
        animal5.move();
        animal5.sleep();
        animal5.bite();
        System.out.println("==============");
        Mammal animal6 = new Mammal("Lion");
        animal6.info();
        animal6.live();
        animal6.eat();
        animal6.move();
        animal6.sleep();
        animal6.growl();
    }
}
