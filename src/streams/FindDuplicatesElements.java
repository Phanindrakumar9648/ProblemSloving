package streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicatesElements {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>(List.of(20,20,30,40,30));

        HashSet<Integer> unique = new HashSet<>();

        List<Integer> duplicates = num.stream().
                filter(i -> !unique.add(i)).toList();
        System.out.println(duplicates);
    }
}
