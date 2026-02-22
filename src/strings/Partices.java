package strings;

import java.util.stream.IntStream;


public class Partices {

    public static void main(String[] args) {

        //find the length of string
        String str = "learn";
        int num = str.length();
        System.out.println(num);

        int count = (int)IntStream.range(0,str.length()).count();
        System.out.println(count);

        //Count vowels in a string
        long vowelsCount =
                IntStream.range(0,str.length())
                        .filter(ch -> "aeiou".indexOf(str.charAt(ch)) !=-1)
                        .count();
        System.out.println(vowelsCount);

        //Count consonants
        long CountConstants =IntStream.range(0,str.length()).filter(ch-> "aeiou".indexOf(str.charAt(ch)) ==-1)
                .count();
        System.out.println(CountConstants);


    }
}
