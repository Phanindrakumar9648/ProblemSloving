package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GetTop3ElementsFromTheList {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95,
                14, 56, 87);
        List<Integer> topThree =
                 listOfIntegers.stream().sorted(Comparator.reverseOrder())
                         .limit(3).toList();
        System.out.println(topThree);

    }
}
