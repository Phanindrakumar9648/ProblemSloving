package strings;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {

        String str = "count vowels in the sentences".toLowerCase(Locale.ROOT);
        Map<Character, Integer> count = new HashMap<>();
        int consonantCount = 0;

        // [c, o, u, n, t,  , v, o, w, e, l, s]
        //Space → ignored,Letters → processed
        //
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    count.merge(ch, 1, Integer::sum);
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowel Counts: " + count);
        System.out.println("Consonant Count: " + consonantCount);
    }

}
