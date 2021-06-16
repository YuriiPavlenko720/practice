package Lesson05HomeWorkAnimals;

public class Fish extends Animal{
    public Fish (){
    }
    public Fish (String name){
        this.name=name;
    }
    public void eat (){
        System.out.println("This animal can eat seafood");
    }
    public void sleep (){
        System.out.println("This animal can sleep in water");
    }
    public void move (){
        System.out.println("This animal can swim");
    }
    public void breathe (){
        System.out.println("This animal can breathe under water");
    }
}
