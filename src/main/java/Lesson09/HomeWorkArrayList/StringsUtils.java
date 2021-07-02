package Lesson09.HomeWorkArrayList;

import java.util.ArrayList;
import java.util.List;


public class StringsUtils {

    public static List<String> getDuplicates(List<String> words) {
        List<String> duplicates = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    if (!duplicates.contains(words.get(i))) {
                        duplicates.add(words.get(i));
                    }
                }
            }
        }
        return duplicates;
    }

    public static List<String> getLongestWord(List<String> words) {
        List<String> longest = new ArrayList<>();
        int max = words.get(0).length();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() >= max) {
                max=words.get(i).length();
                }
            }
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == max) {
                if (!longest.contains(words.get(i))) {
                    longest.add(words.get(i));
                }
            }
        }
        return longest;
    }
}
