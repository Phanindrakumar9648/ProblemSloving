package streams;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoListsRemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> a = List.of(1,2,3,4);
        List<Integer> b = List.of(3,4,5,6);

        HashSet<Integer> seen = new HashSet<>();

        Stream.concat(a.stream(),b.stream()).filter(i -> !seen.add(i)).toList();
        System.out.println(seen);
    }
}
