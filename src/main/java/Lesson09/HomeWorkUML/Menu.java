package Lesson09.HomeWorkUML;

import java.util.ArrayList;

public class Menu {
    public void showEmployees(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Name: " + employees.get(i).getName() + "Surname: " + employees.get(i).getSurname() + "Name: " + employees.get(i).getName());
        }
    }
}
