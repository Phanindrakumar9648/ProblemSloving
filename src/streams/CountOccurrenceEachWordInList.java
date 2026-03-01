package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CountOccurrenceEachWordInList {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");


        words.stream().collect(Collectors.groupingBy(word->word,Collectors.counting()))
                .forEach((word, count) ->
                        System.out.println(word + " = " + count));



    }

}
