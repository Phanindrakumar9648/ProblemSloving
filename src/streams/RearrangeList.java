package streams;


import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*You are given a list representing people where "M" = Male and "F" = Female sit alternately.
Write a program to rearrange the list so that males and females
The relative order of males and females must be preserved*/
public class RearrangeList {
    public static void main(String[] args) {
        List<Character> input = List.of('M', 'M', 'F', 'F', 'M', 'F');

        List<Character> males = input.stream().filter(c-> c=='M').toList();
        List<Character> females = input.stream().filter(c-> c=='F').toList();

        List<Character> result = IntStream.range(0, Math.min(males.size(), females.size()))
                .mapToObj(i-> Stream.of(males.get(i),females.get(i)))
                .flatMap(s->s)
                .toList();

        System.out.println(result);
    }
}
