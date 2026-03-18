package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfStringToUppercase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("phani", "kumar", "pavan");
        String lst = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));

        System.out.println(lst);
    }
}
