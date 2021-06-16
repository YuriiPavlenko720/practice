package Lesson04HomeWorkFigures;

public class Triangle extends Square {
    public Triangle (int sideLength) {
        this.sideLength = sideLength;
    }

    public Triangle(Triangle triangle) {
        this.sideLength = getSideLength();
    }

    public void info () {
        System.out.println("Shape: Triangle");
        System.out.println("Color: " + color);
        System.out.println("Filling: " + filling);
        System.out.println("Length of side: " + sideLength);
        System.out.println("Number of sides: 3");
        System.out.println("Perimeter: " + sideLength * 3);
        System.out.println("Area: " + 3 * Math.pow(sideLength, 2) / (4 * Math.tan(Math.toRadians(180) / 3)));
    }

}
