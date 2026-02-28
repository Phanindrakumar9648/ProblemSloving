package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {

        String str = "swiss";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);

            if (map.get(c) == 2) {
                System.out.println("First repeating character: " + c);
                break;
            }
        }

        //Another Way
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                System.out.println("First repeating character: " + c);
                break;
            }

            set.add(c);
        }

    }
}
