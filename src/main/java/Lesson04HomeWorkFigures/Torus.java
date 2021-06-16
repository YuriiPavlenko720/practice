package Lesson04HomeWorkFigures;

public class Torus extends Circle {
    private double insRadius;

    public Torus(double radius, double insRadius) {
        this.radius = radius;
        this.insRadius = insRadius;
    }

    public Torus(Torus torus) {
        this.radius = getRadius();
        this.insRadius = getInsRadius();
    }

    public void info() {
        System.out.println("Shape: Torus");
        System.out.println("Color: " + color);
        System.out.println("Filling: " + filling);
        System.out.println("Radius: " + radius);
        System.out.println("Insert radius: " + insRadius);
        System.out.println("External Perimeter: " + 2 * Math.PI * radius);
        System.out.println("Internal Perimeter: " + 2 * Math.PI * insRadius);
        System.out.println("Area: " + (Math.PI * Math.pow(radius, 2) - Math.PI * Math.pow(insRadius, 2)));
    }


    public double getInsRadius() {
        return insRadius;
    }

    public void setInsRadius(double insRadius) {
        this.insRadius = insRadius;
    }
}
