package Lesson10.HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Slide54 {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>() {{
            add("one");
            add("b");
            add("three");
            add("four");
            add("seven");
            add("eight");
            add("nine");
            add("twelve");
            add("eleven");
            add("one");
            add("a");
            add("twentyOne");
            add("seventyFour");
            add("one");
            add("null");
        }};

        System.out.println(words);
        System.out.println(getWordsWithLength(words));
        System.out.println(getWordsWithCount(words));

    }

    public static HashMap<String, Integer> getWordsWithLength(List<String> words) {
        HashMap<String, Integer> wordsWithLength = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            wordsWithLength.put(words.get(i), words.get(i).length());
        }
        return wordsWithLength;
    }

    public static HashMap<String, Integer> getWordsWithCount(List<String> words) {
        HashMap<String, Integer> wordsWithCount = new HashMap<>();

        for (int i = 0; i < words.size(); i++) {
            int count = 0;
            for (int j = 0; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    count = count + 1;
                }
            }
            wordsWithCount.put(words.get(i), count);
        }
        return wordsWithCount;
    }
}
