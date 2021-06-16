package Lesson03;

import java.util.Arrays;

public class StringsHomeWork {
    public static void main(String[] args) {
// Task1.Создать из строки, например “Java Core” массив типа char. В результате должен
// получится: [‘J’, ‘A’, ‘V’, ‘A’, ‘_’,‘C’, ‘O’, ‘R’, ‘E’].
// Все символы в массиве в верхнем регистре
// Пробелы заменены на нижнее подчеркивание
// для того чтобы получить символ строки можно воспользоваться методом charAt(),
// который возвращает символ по указанному индексу

        String text = new String("Java Core");
        String newtext = text.toUpperCase().replace(" ", "_");
        char[] chartext = new char[newtext.length()];
        for (int i = 0; i < chartext.length; i++) {
            chartext[i] = newtext.charAt(i);
        }
        System.out.println("========================");
        System.out.println("Task1");
        System.out.println("Ver.1");
        System.out.println(Arrays.toString(chartext));

        //Ver.2 Нашел метод, разбираясь со Strings
        System.out.println("Ver.2");
        char[] chartextV2 = text.toUpperCase().replace(" ", "_").toCharArray();
        System.out.println(Arrays.toString(chartextV2));

        System.out.println("========================");

//Task2. В массиве строк
// String[] words = {"first", "true", "world", "boss", “car” "crocodile", "cucumber"};
// найти:
// 1. самое длинное слово
// 2. самое короткое

        String[] words = {"first", "true", "world", "boss", "car", "crocodile", "cucumber"};
        String max = words[0];
        String min = words[0];
        for (int n = 0; n < words.length; n++) {
            if (words[n].length() > max.length()) {
                max = words[n];
            }
        }
        for (int m = 0; m < words.length; m++) {
            if (words[m].length() < min.length()) {
                min = words[m];
            }
        }
        System.out.println("Task2");
        System.out.println("The longest word is '" + max + "'");
        System.out.println("The shortest word is '" + min + "'");
        System.out.println("========================");

//Task3. Есть многомерный массив строк, например:
// {{“Java”, “Virtual”}, {“Machine”}}
// Нужно объединить все элементы массивов в предложение, например: Java Virtual Machine.
// Слова отделены друг от друга пробелом

        String[][] list = {{"Java", "Virtual"}, {"Machine"}};

        System.out.println("Task3");
        System.out.println(list[0][0]+" "+list[0][1]+" "+list[1][0]);
        System.out.println("========================");
    }
}