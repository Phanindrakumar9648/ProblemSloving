package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNamesStartingWithP {

    public static void main(String[] args) {

        String[] str = {"Phani","Varama","Kumar","Pavan"};
        List<String> list = Arrays.stream(str)
                .filter(ch -> ch.toLowerCase().startsWith("p"))
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
