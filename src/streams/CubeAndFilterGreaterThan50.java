package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeAndFilterGreaterThan50 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> results = numbers.stream().map(num -> num*num*num)
                .filter(num -> num>50).collect(Collectors.toList());
        System.out.println(results);
    }
}
