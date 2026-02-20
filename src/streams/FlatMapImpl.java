package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapImpl {

    public static void main(String[] args) {

        List<List<Integer>> num = Arrays.asList(
                Arrays.asList(1, 2, 34, 6),
                Arrays.asList(3, 4, 4, 5));

        List<Integer> result = num.stream()
                .flatMap(x -> x.stream())   // Returning Stream
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
