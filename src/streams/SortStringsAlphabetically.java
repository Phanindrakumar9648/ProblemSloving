package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsAlphabetically {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple");
        List<String> result = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
