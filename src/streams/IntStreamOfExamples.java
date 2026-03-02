package streams;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOfExamples {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 30, 25, 1,40};

        HashSet<Integer> unquie = new HashSet<>();
        //Find duplicates
        Set<Integer> collect = IntStream.of(arr)
                .filter(i -> !unquie.add(i))
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(collect);

        //Find sum
        int sum = IntStream.of(arr).sum();
        System.out.println(sum);

        //Find max
        int asInt = IntStream.of(arr).max().getAsInt();
        System.out.println(asInt);

        //Filter values > 25 = prints 30,40,
            IntStream.of(arr).filter(i-> i>25)
                .forEach(i-> System.out.print(i + ","));
        System.out.println();

        //i dont need the , at end i am expected 30,40
        String val = IntStream.of(arr).filter(i -> i > 25)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(val);

        //Find First Non-Repeated Element
        IntStream.of(arr).boxed().collect(Collectors.groupingBy( i -> i,
                        LinkedHashMap::new,      // preserves insertion order
                Collectors.counting())).entrySet().stream()
                .filter(i->i.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst().ifPresent(System.out::println);

        //Find Second Highest Number
        int secondHighest =
                IntStream.of(arr)
                        .boxed()
                        .sorted((a, b) -> b - a)
                        .distinct()
                        .skip(1)
                        .findFirst()
                        .orElse(-1);
        System.out.println(secondHighest);

        //Check If Array Contains Only Unique Elements
        boolean allUnique =
                IntStream.of(arr)
                        .distinct()
                        .count() == arr.length;

        System.out.println(allUnique);

        //Partition Numbers into Even and Odd
        Map<Boolean, List<Integer>> result =
                IntStream.of(arr)
                        .boxed()
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(result);

        //Find Frequency of Each Element
        Map<Integer, Long> frequency =
                IntStream.of(arr)
                        .boxed()
                        .collect(Collectors.groupingBy(
                                n -> n,
                                Collectors.counting()
                        ));

        System.out.println(frequency);

        //Find Numbers Greater Than Average
        double avg = IntStream.of(arr).average().orElse(0);

        List<Integer> greaterThanAvg =
                IntStream.of(arr)
                        .filter(n -> n > avg)
                        .boxed()
                        .toList();

        System.out.println(greaterThanAvg);

        //Find Missing Number
        int[] arrMiss = {1, 2, 4, 5};

        int n = 5;

        int expectedSum = IntStream.rangeClosed(1, n).sum();
        int actualSum = IntStream.of(arrMiss).sum();

        System.out.println("Missing: " + (expectedSum - actualSum));

        //Check If Array Is Palindrome
        boolean isPalindrome =
                IntStream.range(0, arr.length / 2)
                        .allMatch(i -> arr[i] == arr[arr.length - 1 - i]);

        System.out.println(isPalindrome);

        //Find Maximum Product of Two Numbers
        int maxProduct =
                IntStream.of(arr)
                        .boxed()
                        .sorted((a, b) -> b - a)
                        .limit(2)
                        .reduce(1, (a, b) -> a * b);

        System.out.println(maxProduct);

    }}