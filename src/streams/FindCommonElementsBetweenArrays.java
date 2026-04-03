package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonElementsBetweenArrays {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        Set<Integer> set = new HashSet<>(list2);

        List<Integer> result = list1.stream()
                .filter(set::contains)
                .toList();

        System.out.println(result);
    }
}
