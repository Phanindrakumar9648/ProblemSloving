package streams;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHigestSalary {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(20000, 10000, 350000, 400000);
        list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .ifPresent(System.out::println);


    }
}
