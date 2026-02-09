package arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 3, 2, 1};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) //true
            {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        System.out.println("Removed the duplicates:" + duplicates);
    }
}
