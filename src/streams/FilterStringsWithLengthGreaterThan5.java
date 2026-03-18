package streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsWithLengthGreaterThan5 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Kumar","Phanindra Kumar","Sai Nanda","Nani","Eega","Dusherra");

        str.stream().filter(ch -> ch.length()>5)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
