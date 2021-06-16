package Lesson04HomeWorkFigures;

public class Shape {
    public String color;
    public boolean filling;

    public Shape(){

    }
    public Shape(String color, boolean filling){
        this.color=color;
        this.filling=filling;
    }
    public Shape(Shape shape) {
        this.color = shape.getColor();
        this.filling = shape.isFilling();
    }

    public void info () {
        System.out.println("Color: " + color);
        System.out.println("Filling: " + filling);

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilling() {
        return filling;
    }

    public void setFilling(boolean filling) {
        this.filling = filling;
    }
}
