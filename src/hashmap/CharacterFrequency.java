package hashmap;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CharacterFrequency {

    public static void main(String[] args) {
        String name = "find the count 123 of each letter repeated times!"
                .toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z]", "");
        Map<Character, Integer> map = new HashMap<>();

        for (char c : name.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        System.out.println(map);
    }

}
