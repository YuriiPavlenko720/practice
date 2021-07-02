package Lesson09.HomeWorkArrayList;

import java.util.ArrayList;
import java.util.List;


public class NumberUtils {

    public static Integer getSum(List<Integer> numbers) {
        Integer sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);

        }
        return sum;
    }

    public static List<String> multiplyOddNumbers(List<Integer> numbers) {
        List<String> answer = new ArrayList<>();
        Integer multiply = 1;
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                multiply = multiply * numbers.get(i);
                count=count+1;
            }
        }
        if (count == 0) {
            answer.add("Нечетные элементы отсутствуют!");
        }
        else answer.add(multiply.toString());
        return answer;
    }
}
