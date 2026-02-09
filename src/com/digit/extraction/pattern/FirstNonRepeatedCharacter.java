package com.digit.extraction.pattern;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {

        String word = "swiss";
        Map<Character, Integer> count = new HashMap<>();
        for (char c : word.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (char c : word.toCharArray()) {
            if (count.get(c) == 1) {

                System.out.println("First non-repeated charcter:" + c);
                break;
            }
        }

    }
}
