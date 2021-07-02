package Lesson09.HomeWorkUML;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Man {
    private String position;
    private IdCard card;
    private List<Room> rooms;
    private Department department;
    private List<PastPosition> pastPositions = new ArrayList<>();

    public Employee(String name, String surname, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public IdCard getCard() {
        return card;
    }

    public void setCard(IdCard card) {
        this.card = card;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRooms(Room r) {
        rooms.add(r);
    }

    public void deleteRooms(Room r) {
        rooms.remove(rooms.indexOf(r));
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<PastPosition> getPastPositions() {
        return pastPositions;
    }

    public void setPastPositions(List<PastPosition> pastPositions) {
        this.pastPositions = pastPositions;
    }

    public void addPastPosition(PastPosition p) {
        pastPositions.add(p);
    }

    public void deletePastPosition(PastPosition p) {
        pastPositions.remove(pastPositions.indexOf(p));
    }
}
