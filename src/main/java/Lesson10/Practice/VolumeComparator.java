package Lesson10.Practice;

import java.util.Comparator;

public class VolumeComparator implements Comparator<Car> {
    @Override
    public int compare(Car left, Car right) {
        if (left.getVolume() == 0) {
            return 1;
        }
        if (right.getVolume() == 0) {
            return -1;
        } else return Double.compare(left.getVolume(), right.getVolume());
    }
}
