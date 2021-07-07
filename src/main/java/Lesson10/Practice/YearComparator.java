package Lesson10.Practice;

import java.util.Comparator;

public class YearComparator implements Comparator<Car> {
    @Override
    public int compare(Car left, Car right) {
        return Integer.compare(left.getYearOfManufacture(), right.getYearOfManufacture());
    }
}
