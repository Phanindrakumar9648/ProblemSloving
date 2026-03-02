package streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerostoEnd {
    public static void main(String[] args) {

        int[] arr = {1, 0, 4, 1, 5, 6};

        System.out.println("---- Counting Non-Zero ----");

        int nonZeroCount = (int) Arrays.stream(arr)
                .peek(n -> System.out.println("Original element: " + n))
                .filter(n -> n != 0)
                .peek(n -> System.out.println("After filter (non-zero): " + n))
                .count();

        System.out.println("Non-zero count: " + nonZeroCount);

        System.out.println("---- Building Final Stream ----");

        int[] result = IntStream.concat(
                Arrays.stream(arr)
                        .filter(n -> n != 0)
                        .peek(n -> System.out.println("Non-zero stream value: " + n)),

                IntStream.range(0, arr.length - nonZeroCount)
                        .map(i -> 0)
                        .peek(n -> System.out.println("Zero stream value: " + n))
        ).toArray();

        System.out.println("Final Result: " + Arrays.toString(result));
    }}