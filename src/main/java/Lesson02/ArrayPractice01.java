package Lesson02;

public class ArrayPractice01 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 5, 6, 87, 16, 96};
        int[] oddNumbers = new int[numbers.length];
        int indexOddNumber=0;
        for (int indexNumbers = 0; indexNumbers < numbers.length; indexNumbers++)
            if (numbers[indexNumbers] % 2 == 1) {
                    oddNumbers[indexOddNumber] = numbers[indexNumbers];
                indexOddNumber++;
            }

        for (int i = 0; i < indexOddNumber; i++) {
            System.out.println(oddNumbers[i]);
        }
    }
}