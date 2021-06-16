package Lesson04HomeWorkFigures;

public class Pentagon extends Square {
    public Pentagon(double sideLength) {
        this.sideLength = sideLength;
    }

    public Pentagon(Pentagon pentagon) {
        this.sideLength = getSideLength();
    }

    public void info() {
        System.out.println("Shape: Pentagon");
        System.out.println("Color: " + color);
        System.out.println("Filling: " + filling);
        System.out.println("Length of side: " + sideLength);
        System.out.println("Number of sides: 5");
        System.out.println("Perimeter: " + sideLength * 5);
        System.out.println("Area: " + 5 * Math.pow(sideLength, 2) / (4 * Math.tan(Math.toRadians(180) / 5)));
    }


}
