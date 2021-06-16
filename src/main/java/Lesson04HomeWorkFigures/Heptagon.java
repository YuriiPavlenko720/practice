package Lesson04HomeWorkFigures;

public class Heptagon extends Square {

    public Heptagon(double sideLength) {
        this.sideLength = sideLength;
    }

    public Heptagon(Heptagon heptagon) {
        this.sideLength = getSideLength();
    }

    public void info () {
        System.out.println("Shape: Heptagon");
        System.out.println("Color: " + color);
        System.out.println("Filling: " + filling);
        System.out.println("Length of side: " + sideLength);
        System.out.println("Number of sides: 7");
        System.out.println("Perimeter: " + sideLength * 7);
        System.out.println("Area: " + 7 * Math.pow(sideLength, 2) / (4 * Math.tan(Math.toRadians(180) / 7)));
    }

}
