package Lesson04HomeWorkFigures;

public class RTriangle extends Rectangle {

    public RTriangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public RTriangle(RTriangle rTriangle) {
        this.a = getA();
        this.b = getB();
    }

    public void info() {
        System.out.println("Shape: Right triangle");
        System.out.println("Color: " + color);
        System.out.println("Filling: " + filling);
        System.out.println("Leg A length: " + a);
        System.out.println("Leg B length: " + b);
        System.out.println("Perimeter: " + (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b));
        System.out.println("Area: " + a * b / 2);
    }
}
