package streams;

import java.util.Arrays;
import java.util.List;

public class CheckAllNumbersEvenOrNot {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        boolean results = numbers.stream().allMatch(x-> x%2 ==0);
        System.out.println("Result: " + results);
    }
}
