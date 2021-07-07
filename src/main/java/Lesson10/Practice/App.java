package Lesson10.Practice;

import java.util.*;

public class App {
    public static void main(String[] args) {
        YearComparator yComparator = new YearComparator();
        Car car1 = new Car("BMW", "X5", 2005);
        car1.setVolume(10);
        Car car2 = new Car("BMW", "X3", 2003);
        car2.setVolume(0);
        Car car3 = new Car("Toyota", "Prius", 2010);
        car3.setVolume(0);
        Car car4 = new Car("Toyota", "Corolla", 1999);
        car4.setVolume(11);
        Car car5 = new Car("Zaz", "Sens", 2015);
        car5.setVolume(8);

        List<Car> autos = new ArrayList<>() {{
            add(car1);
            add(car2);
            add(car3);
            add(car4);
            add(car5);
        }};
        Collections.sort(autos, yComparator);
        System.out.println("Сортировка по году: " + autos);

        Set<Car> setAutos = new TreeSet<Car>(new VolumeComparator());
        setAutos.addAll(autos);
        System.out.println("Сортировка по расходу: " + setAutos);


    }
}
