package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbersAscendingAndDescending {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,4,1,2,3,45,4,3,7,89,0,3,21314,13123);

        String ascending = numbers.stream().sorted()
                .map(num -> String.valueOf(num))
                .collect(Collectors.joining(","));
        System.out.println("Ascending: " + ascending);

        String descending = numbers.stream()
                /*.sorted((a, b) -> b - a)*/
                .sorted(Comparator.reverseOrder())
                .map(num -> String.valueOf(num))
                .collect(Collectors.joining(","));

        System.out.println("Descending: " + descending);
    }
}
