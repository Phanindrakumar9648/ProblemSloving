package streams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeMaps {
    public static void main(String[] args) {

        Map<String, Integer> map1 = Map.of("A", 2, "B", 3);
        Map<String, Integer> map2 = Map.of("A", 5, "C", 1);
        Map<String, Integer> result = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        Integer::sum));
        System.out.println(result);
    }
}
