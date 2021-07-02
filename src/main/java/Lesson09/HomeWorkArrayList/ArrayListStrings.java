package Lesson09.HomeWorkArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStrings extends StringsUtils {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Первый");
        strings.add("Второй");
        strings.add("Третий");
        strings.add("Четвертый");
        strings.add("Пятый");
        strings.add("Первый");
        strings.add("Коротышка");
        strings.add("Третий");
        strings.add("Пятый");
        strings.add("Пятый");
        strings.add("Четвертый");



        System.out.println("Повторяются слова: " + getDuplicates(strings));
        System.out.println("Самое длинное слово: " + getLongestWord(strings));

    }

}
