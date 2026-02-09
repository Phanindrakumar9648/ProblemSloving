package com.digit.extraction.pattern;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "Reverse Each Word";
        String[] split = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : split) {
            StringBuilder reversedStr = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedStr.append(word.charAt(i));
            }
            result.append(reversedStr).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
