package Lesson10.HomeWork;

import java.util.*;

public class Slide62 {
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
        System.out.println(getLengthWithWords(words));
//        System.out.println(getLengthWithWords2(words));

        TreeMap<String, String> words2 = new TreeMap<>() {{
            put("one", "один");
            put("two", "два");
            put("three", "три");
            put("four", "четыре");
            put("five", "пять");
        }};

        System.out.println(words2);
        replaceKeyValue(words2);
        System.out.println(words2);

    }

    public static TreeMap<Integer, List<String>> getLengthWithWords(List<String> words) {
        TreeMap<Integer, List<String>> lengthWithWords = new TreeMap<>();
        for (int i = 0; i < words.size(); i++) {
            List<String> sameLengthWords = new ArrayList<>();
            for (int j = 0; j < words.size(); j++) {
                if (words.get(i).length() == words.get(j).length()) {
                    sameLengthWords.add(words.get(j));
                }
            }
            lengthWithWords.put(words.get(i).length(), sameLengthWords);
        }
        return lengthWithWords;
    }

/*
// возвращает весь список
    public static TreeMap<Integer, List<String>> getLengthWithWords2 (List<String> words) {
        TreeMap<Integer, List<String>> lengthWithWords = new TreeMap<>();
        for (int i = 0; i < words.size(); i++) {
            lengthWithWords.put(words.get(i).length(), words);
        }
        return lengthWithWords;
    }
*/

    public static void replaceKeyValue(Map<String, String> map) {
        TreeMap<String, String> replacedMap = new TreeMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            replacedMap.put(entry.getValue(), entry.getKey());
        }
        map.clear();
        map.putAll(replacedMap);
    }
}

