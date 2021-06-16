package Lesson06HomeWorkAutopark;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(String name, double price, double consumption) {
        this.name = name;
        this.price = price;
        this.consumption = consumption;
    }
    @Override
    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Price " + price + " hrn.");
        System.out.println("Consumption: " + consumption + " l/100km");
        System.out.println("-----------------------------");
    }
}
