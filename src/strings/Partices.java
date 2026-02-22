package strings;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Partices {

    public static void main(String[] args) {

        //find the length of string
        String str = "learn";
        int num = str.length();
        System.out.println(num);

        int count = (int) IntStream.range(0, str.length()).count();
        System.out.println(count);

        //Count vowels in a string
        long vowelsCount =
                IntStream.range(0, str.length())
                        .filter(ch -> "aeiou".indexOf(str.charAt(ch)) != -1)
                        .count();
        System.out.println(vowelsCount);

        //Count consonants
        long CountConstants = IntStream.range(0, str.length()).filter(ch -> "aeiou".indexOf(str.charAt(ch)) == -1)
                .count();
        System.out.println(CountConstants);

        //Print each character in uppercase using streams
        IntStream.range(0, str.length()).map(ch -> Character.toUpperCase(str.charAt(ch)))
                .forEach(ch -> System.out.print((char) ch));
        System.out.println();

        //Find first repeating character
        String repatCh = "programming";
        Set<Character> seen = new HashSet<>();
        Optional<Character> firstRepeated = repatCh.chars().mapToObj(ch -> (char) ch)
                .filter(ch -> !seen.add(ch)).findFirst();
        firstRepeated.ifPresent(System.out::println);

        //Sreams hands-on CAT, TAC, DON, NOD, TELL count frequency, as cat and tac have same character so consider same.
            List<String> sameFre = Arrays.asList("CAT", "TAC", "DON", "NOD", "TELL");
        sameFre.stream().collect(Collectors.groupingBy(ch ->
                        {
                            char[] characters = ch.toCharArray();
                            Arrays.sort(characters);
                            return new String(characters);
                        },
                        Collectors.counting())
        ).forEach((key, value) -> System.out.println(key + '-' + value));

        Map<String,List<String>> val = sameFre.stream().collect(Collectors.groupingBy(ch ->
                                {
                                    char[] characters = ch.toCharArray();
                                    Arrays.sort(characters);
                                    return new String(characters);
                                },
                                Collectors.toList())
                );

        //Ways of implement the output
            val.entrySet().stream().forEach(ch -> System.out.println(ch.getValue()));

            val.values().stream().filter(list -> list.size()>1)
                    .map(list -> list.get(0))
                    .forEach(ch -> System.out.println(ch +" are Anagaram"));

    }
}
