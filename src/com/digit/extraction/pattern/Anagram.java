package com.digit.extraction.pattern;

import java.util.HashMap;
import java.util.Locale;

public class Anagram {

    public static void main(String[] args) {

        //One approach
      /*  String str = "Silent";
        String str2 = "listen";

        String strLow = str.toLowerCase(Locale.ROOT);
        String strLow2 = str2.toLowerCase(Locale.ROOT);
        char[] c = strLow.toCharArray();
        char[] c2 = strLow2.toCharArray();

        Arrays.sort(c);
        Arrays.sort(c2);
        if (Arrays.equals(c, c2)) {
            System.out.println("Is an anagram");
        } else
            System.out.println("not an anagram");*/

        //other apprach using the hash map

        String str = "silent".toLowerCase(Locale.ROOT);
        String str2 = "listen".toLowerCase(Locale.ROOT);

        if(str.length() != str2.length())
        {
            System.out.println("It was not an angaram");
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : str2.toCharArray())
        {
            if(!map.containsKey(c)){
                System.out.println("Not anagram");
                return;
            }
            map.put(c,map.getOrDefault(c,0)-1);
        }
        System.out.println("Is anagram");
    }
}
