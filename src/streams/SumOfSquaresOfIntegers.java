package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquaresOfIntegers {

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(2,4,5,2,5,13,19,21,75);
        Integer nums  = numbers.stream().map(x-> x*x).reduce((x1,x2)->x1+x2).get();
        System.out.println(nums);

        //lsit of numbers morethan 10

        List<Integer> result = numbers.stream().filter(x->x>10).collect(Collectors.toList());
        System.out.println(result);

        List<Integer>  ele = numbers.stream()
                .filter(x -> x > 2)
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(ele);
    }
}
