package Lesson09.Practice;

public class Engine {
    private double volume;
    private double power;

    public Engine(double volume, double power) {
        this.volume = volume;
        this.power = power;
    }

    public Engine() {
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
