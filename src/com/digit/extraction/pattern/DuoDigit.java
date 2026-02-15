package com.digit.extraction.pattern;

import java.util.HashSet;
import java.util.Set;

public class DuoDigit {

    public static void main(String[] args) {

        //using string input as strings
        int number = 1212122;
        /*int num=1212122;
        Set<Integer> set = new HashSet<>();
        while(num>0)
        {
            set.add(num%10);
            num = num/10;
        }
        if(set.size()<=2)
        {
            System.out.println("duo digit");
        }
        else{
            System.out.println("It was not duo digit");
        }*/

        //using the input as string

        isDuoDigit(number);
        if (isDuoDigit(number)) {
            System.out.println("It is a Duo Digit number");
        } else {
            System.out.println("It is NOT a Duo Digit number");
        }
    }


    public static boolean isDuoDigit(int number) {
        number = Math.abs(number);
        String s = String.valueOf(number);

        Set<Character> set = new HashSet<>();


        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size() <= 2;
    }
}
