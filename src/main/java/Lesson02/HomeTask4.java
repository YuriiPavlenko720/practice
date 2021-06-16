package Lesson02;

import java.util.Arrays;
public class HomeTask4 {
    public static void main(String[] args) {
        int[] numbers = {1, -9, 5, 5, 6, -7, 3, 7, -2, 0}; // массив целых чисел
        int[] result = new int[numbers.length];
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max)
                result[i] = min;
            else if (numbers[i] == min)
                result[i] = max;
            else
                result[i] = numbers[i];
        }
        System.out.println("Task1");
        System.out.println("Numbers:" + Arrays.toString(numbers));
        System.out.println("Results:" + Arrays.toString(result));
        System.out.println("========================");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <0)
                result[i] = 0;
            else
                result[i] = numbers[i];
        }

        System.out.println("Task2");
        System.out.println("Numbers:" + Arrays.toString(numbers));
        System.out.println("Results:" + Arrays.toString(result));
        System.out.println("========================");

        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] <0)
                result[i] = numbers[i];
            else if (numbers[i+1] <0)
                result[i] = 3*numbers[i];
            else
                result[i] = numbers[i];
        }

        System.out.println("Task3");
        System.out.println("Numbers:" + Arrays.toString(numbers));
        System.out.println("Results:" + Arrays.toString(result));
        System.out.println("========================");

    }
}