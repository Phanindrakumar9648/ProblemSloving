package hashmap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

public class Occurances {

    public static void main(String[] args) {

        String name = "aabccdd";

        String collect = IntStream.range(0, name.length())
                .mapToObj(ch -> name.charAt(ch))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().map(entry -> entry.getKey()+ "" + entry.getValue())
                .collect(joining());

        System.out.println(collect);


    }
}
