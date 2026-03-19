package streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesSort {
    public static void main(String[] args) {
        int[] numbers = {3,1,2,3,2};

        String collect = Arrays.stream(numbers).distinct().sorted()
                .mapToObj(ele -> String.valueOf(ele))
                .collect(Collectors.joining(","));
        System.out.println(collect);

    }
}
