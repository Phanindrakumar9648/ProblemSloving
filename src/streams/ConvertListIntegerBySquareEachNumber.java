package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListIntegerBySquareEachNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,8,9);

        String result = list.stream().map(num -> num*num)
                .map(num -> String.valueOf(num))
                .collect(Collectors.joining(","));

        System.out.println(result);

    }
}
