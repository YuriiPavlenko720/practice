package Lesson04HomeWorkFigures;

public class Square extends Shape {
    public double sideLength;

    public Square (){

    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public Square(Square square) {
        this.sideLength = getSideLength();
    }

    public void info () {
        System.out.println("Shape: Square");
        System.out.println("Color: " + color);
        System.out.println("Filling: " + filling);
        System.out.println("Length of side: " + sideLength);
        System.out.println("Number of sides: 4");
        System.out.println("Perimeter: " + sideLength*4);
        System.out.println("Area: " + Math.pow(sideLength,2));
    }
    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
