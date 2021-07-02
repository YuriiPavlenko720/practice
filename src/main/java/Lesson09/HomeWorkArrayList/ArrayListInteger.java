package Lesson09.HomeWorkArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInteger extends NumberUtils {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);


        System.out.println("Сумма цифр: " + getSum(numbers));
        System.out.println("Произведение нечетных элементов: " + multiplyOddNumbers(numbers));
    }

}
