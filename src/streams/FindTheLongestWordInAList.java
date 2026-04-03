package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindTheLongestWordInAList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe", "zebra");

        words.stream()
                .max(Comparator.comparingInt(String::length))
                .ifPresent(word -> System.out.println(word));
    }
}
