package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CsvFlatList {
    public static void main(String[] args) {

        List<String> input = List.of("a.b.c", "de");

        List<String> result = input.stream()
                .flatMap(line -> Arrays.stream(line.split("\\.")))
                .flatMap(token -> token.chars()
                        .mapToObj(c -> String.valueOf((char) c)))
                .map(String::trim)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
