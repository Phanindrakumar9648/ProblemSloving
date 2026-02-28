package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesWithoutDistinct {

    public static void main(String[] args) {
        List<Integer> duplicateNumbers = Arrays.asList(1,2,3,4,2,3,2,2,1);

        HashSet<Integer> seen= new HashSet<>();
        List<Integer> result = duplicateNumbers.stream()
                .filter(seen::add)
                .toList();
        System.out.println(result);

    }
}
