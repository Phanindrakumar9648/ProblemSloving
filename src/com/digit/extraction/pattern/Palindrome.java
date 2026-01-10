package com.digit.extraction.pattern;

//A palindorme is a word or number that reads same forward and backward
public class Palindrome {

    public static void main(String[] args) {
        //one way
        /*String s = "madam";
        String reversed = new StringBuilder(s).reverse().toString();
        if (s.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }*/

        //other way
        String s = "madam";
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("Not Palindrome");
            }
            left++;
            right--;
        }
        System.out.println(" Palindrome");
    }
}
