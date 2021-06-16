package Lesson04HomeWorkFigures;

public class Hexagon extends Square {
    public Hexagon (double sideLength) {
        this.sideLength = sideLength;
    }

    public Hexagon(Hexagon hexagon) {
        this.sideLength = getSideLength();
    }

    public void info () {
        System.out.println("Shape: Hexagon");
        System.out.println("Color: " + color);
        System.out.println("Filling: " + filling);
        System.out.println("Length of side: " + sideLength);
        System.out.println("Number of sides: 6");
        System.out.println("Perimeter: " + sideLength * 6);
        System.out.println("Area: " + 6 * Math.pow(sideLength, 2) / (4 * Math.tan(Math.toRadians(180) / 6)));
    }

}
