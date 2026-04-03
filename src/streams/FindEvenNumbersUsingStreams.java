package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbersUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = numbers.stream()
                .filter(x-> x%2 ==0 ).collect(Collectors.toList());
        System.out.println(result);

        numbers.stream()
                .filter(x-> x%2 ==0 ).findFirst().ifPresent(num -> System.out.println(num));
    }
}
