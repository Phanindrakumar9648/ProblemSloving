package streams;

import java.util.Arrays;
import java.util.List;

public class NumbersStartingWith1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 12, 20, null, 19, 30);

        List<Integer> startWith1 = numbers.stream().filter(i-> String.valueOf(i).startsWith("1"))
                .toList();
        System.err.println(startWith1);
    }
}
