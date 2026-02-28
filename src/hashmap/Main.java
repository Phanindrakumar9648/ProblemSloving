package hashmap;

    import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String str = "banana";

        Map<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxCount = 0;
        int maxChar = ' ';
        // Step 2: Find max frequency character
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("Character with max frequency: " + maxChar);
        System.out.println("Frequency: " + maxCount);

       //streams
        Map<Character, Long> freqMap = str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy
                        (Function.identity(),Collectors.counting()));

        Map.Entry<Character, Long> maxEntry =
                freqMap.entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                                .get();
         System.out.println("Character: " + maxEntry.getKey());
        System.out.println("Frequency: " + maxEntry.getValue());

    }
}
