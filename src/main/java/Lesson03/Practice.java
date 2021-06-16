package Lesson03;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int[][] numbers = new int[5][];
        for (int i = 0; i < numbers.length; i++) {
            int l = i + 1;
            numbers[i] = new int[l];
            Arrays.fill(numbers[i], l);
        }
        System.out.println(Arrays.deepToString(numbers));


        String firstName = "vasia";
        String secondName = "petrenko";
        String fullName = createFullName(firstName, secondName);
        System.out.println(fullName);
    }

    public static String createFullName(String firstName, String secondName) {
        return firstName.toUpperCase() + " " + secondName.toUpperCase();
    }
}
