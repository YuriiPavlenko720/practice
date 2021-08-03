package Lesson11;

public class Car extends Vehicle{
    private String name;

    public Car(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


}
