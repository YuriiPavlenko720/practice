package Lesson05HomeWorkAnimals;

public class Animal {
    public String name;

    public Animal (){
    }
    public Animal (String name){
        this.name=name;
    }
    public void live (){
        System.out.println("This animal can live");
    }
    public void eat (){
        System.out.println("This animal can eat");
    }
    public void sleep (){
        System.out.println("This animal can sleep");
    }
    public void move (){
        System.out.println("This animal can move");
    }
    public void info (){
        System.out.println(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
