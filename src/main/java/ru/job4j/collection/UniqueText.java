package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] duplicate = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        check.addAll(Arrays.asList(origin));

        for (String word : duplicate) {
            if (!check.contains(word)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}