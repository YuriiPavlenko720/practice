package Lesson06HomeWorkAutopark;


public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 200000, 14);
        car1.info();
        Car car2 = new Car("ZAZ", 50000, 12);
        car2.info();
        Car car3 = new Car("Lexus", 300000, 16);
        car3.info();

        // Вывод стоимости
        System.out.println("==============================");
        System.out.println("Cost of Autopark = " + (car1.getPrice() + car2.getPrice() + car3.getPrice()) + " hrn.");
        System.out.println("==============================");

        // Поиск в диапазоне стоимости
        System.out.println("Found in range: ");
        int count = 0;
        Car[] list = {car1, car2, car3};
        for (int i = 0; i < list.length; i++) {
            if (list[i].getPrice() < 400000) {
                if (list[i].getPrice() > 60000) {
                    list[i].info();
                    count = count + 1;
                }
            }
        }
        System.out.println("Total: " + count + " cars in range.");
        System.out.println("=======================");

        //Сортировка по расходу
        System.out.println("Ranged by consumption: ");
        int eco;
        Car temp;
        for (int i = 0; i < list.length - 1; i++) {
            eco = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].getConsumption() < list[eco].getConsumption()) {
                    eco = j;
                }
            }
            temp = list[i];
            list[i] = list[eco];
            list[eco] = temp;
        }

        //вывод итогового массива
        for (int i = 0; i < list.length; i++) {
            list[i].info();
        }
    }
}
