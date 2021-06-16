package Lesson04HomeWorkFigures;

public class Rectangle extends Shape {
    public int a;
    public int b;

    public Rectangle() {

    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(Rectangle rectangle) {
        this.a = getA();
        this.b = getB();
    }

    public void info() {
        System.out.println("Shape: Rectangle");
        System.out.println("Color: " + color);
        System.out.println("Filling: " + filling);
        System.out.println("Side A length: " + a);
        System.out.println("Side B length: " + b);
        System.out.println("Perimeter: " + (2 * a + 2 * b));
        System.out.println("Area: " + a*b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
