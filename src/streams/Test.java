package streams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 40, 20, 50};

        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates =
                IntStream.of(arr)
                        .filter(num -> !seen.add(num)).boxed().collect(Collectors.toSet());

        System.out.println("Duplicates: " + duplicates);
    }
}
