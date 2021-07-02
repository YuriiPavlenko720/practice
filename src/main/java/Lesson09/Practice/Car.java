package Lesson09.Practice;

public class Car implements Vehicle {
    private String name;
    private Passport passport;
    private Wheel[] wheels;
    private String type;

    @Override
    public void start(){
        System.out.println("Starting...");
    }
    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    private Engine engine = new Engine();

    public Car(String name, Passport passport, Engine engine) {
        this.name = name;
        this.passport = passport;
        this.engine = engine;
    }

    public Car() {
    }

    public void drive() {
        System.out.println("Driving...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }



}
