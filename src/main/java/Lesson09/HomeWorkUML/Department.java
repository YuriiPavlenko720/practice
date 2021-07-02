package Lesson09.HomeWorkUML;

import java.util.List;

public class Department implements Unit {

    private String name;
    private List<Employee> employees;

    @Override
    public int getPersonCount() {
        return employees.size();
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void deleteEmployee(Employee e) {
        employees.remove(employees.indexOf(e));
    }


}
