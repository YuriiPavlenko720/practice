package Lesson09.Practice;

public class Passport {
    private long id;
    private int year;

    public Passport(long id, int year) {
        this.id = id;
        this.year = year;
    }

    public Passport() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
