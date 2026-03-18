package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullValuesFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, null, 3, null, 5);
        list.stream().filter(ele -> ele !=null)
                .collect(Collectors.toList()).forEach(System.out::print);
    }
}
