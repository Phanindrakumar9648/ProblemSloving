package streams;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNonRepeatedCharacterInAString {

    public static void main(String[] args) {

        String str ="swiss";

        str.toLowerCase().chars().mapToObj(ch -> (char)ch)
                .collect(Collectors.groupingBy(ch ->ch,
                        LinkedHashMap::new,
                        Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst().ifPresent(System.out::println);

    }
}
