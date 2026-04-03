package streams;

import java.util.Arrays;
import java.util.List;

public class FindPalindromeStrings {
    public static void main(String[] args) {
        List<String> palindromeNames = Arrays.asList("Telugu", "Tamil",
                "Malayalam");

/*
        for(String str: palindromeNames)
        {
            String reversed = "";
            for(int i = str.length()-1;i>=0;i--)
            {
                reversed = reversed+ str.charAt(i);
            }

            if(str.equalsIgnoreCase(reversed))
            {
                System.out.println(str + " is a Palindrome");
            }
        }*/

        palindromeNames.stream().filter(str -> str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()))
                .forEach(str -> System.out.println(str + " is a Palindrome"));

    }
}
