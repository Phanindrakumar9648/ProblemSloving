package streams;

import java.util.stream.IntStream;

public class DiamondPattern {

    public static void main(String[] args) {

        int n = 5;

        // Top half
        IntStream.rangeClosed(1, n)
                .mapToObj(i -> " ".repeat(n - i) + "*".repeat(2 * i - 1))
                .forEach(System.out::println);

        // Bottom half
        IntStream.iterate(n - 1, i -> i >= 1, i -> i - 1)
                .mapToObj(i -> " ".repeat(n - i) + "*".repeat(2 * i - 1))
                .forEach(System.out::println);

    }
}
