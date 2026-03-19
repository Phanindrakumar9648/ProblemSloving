package streams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValues {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 1);
        map.put("C", 2);

        LinkedHashMap<String, Integer> result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap
                        (entry -> entry.getKey(),
                                entry -> entry.getValue(),
                                (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(result);

    }
}
