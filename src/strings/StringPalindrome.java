package strings;

import java.util.Locale;

public class StringPalindrome {

    public static void main(String[] args) {
        String s = "Madam";
        if (s == null) {
            System.out.println("Not Palindrome");
            return;
        }
        s = s.toLowerCase(Locale.ROOT);
        int start = 0;
        int end = s.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Given String is an palindrome");
        } else {
            System.out.println("Given String is an Not palindrome");
        }
    }
}
