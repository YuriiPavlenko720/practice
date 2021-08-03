package Lesson11;

public class appGarage {
    public static void main(String[] args) {
        GarageGeneric<Vehicle> vehicleList = new GarageGeneric<>();

        Car car1 = new Car("Легковой автомобиль");
        Car car2 = new Car("Грузовой автомобиль");
        Vehicle vehicle1 = new Vehicle("Велосипед");
        Vehicle vehicle2 = new Vehicle("Мотороллер");

        vehicleList.add(car1);
        vehicleList.add(car2);
        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);

        System.out.println(vehicleList.get(2).getName());

        System.out.println("---------------");
        System.out.print("Cars: [");
        for (int i = 0; i < vehicleList.getByType(Car.class).size(); i++) {
            System.out.print(vehicleList.getByType(Car.class).get(i).getName() + ", ");
        }
        System.out.println("]");
    }
}