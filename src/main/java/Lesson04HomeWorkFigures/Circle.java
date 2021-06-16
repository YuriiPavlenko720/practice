package Lesson04HomeWorkFigures;

public class Circle extends Shape {
    public double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Circle circle) {
        this.radius = getRadius();
    }

    public void info() {
        System.out.println("Shape: Circle");
        System.out.println("Color: " + color);
        System.out.println("Filling: " + filling);
        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + 2 * Math.PI * radius);
        System.out.println("Area: " + Math.PI*Math.pow(radius, 2));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
