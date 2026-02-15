package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {
    public static void main(String[] args) {

        // Convert stream to list
        List<String> str = Stream.of("A", "B")
                .collect(Collectors.toList());
        System.out.println(str);

        //Count elements

        long count = Stream.of("A", "B")
                .count();
        System.out.println(count);

        //Join strings

        String result = Stream.of("A", "B")
                .collect(Collectors.joining());
        System.out.println(result);


        int sum = Stream.of(1, 2, 3, 4)
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);

        List<String> names = Arrays.asList("Ram", "Ravi", "Sita", "Sunil");

        Map<Integer, List<String>> results =
                names.stream()
                        .collect(Collectors.groupingBy(String::length));

        System.out.println(results);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> resul =
                numbers.stream()
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(resul);
    }
}
