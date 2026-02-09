package com.digit.extraction.pattern;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "Phani";
        char[] c  = s.toCharArray();
        String reversed = "";
        for(int i = c.length-1;i>=0;i--)
        {
            reversed = reversed + s.charAt(i);
        }
        System.out.println(reversed);
    }
}
