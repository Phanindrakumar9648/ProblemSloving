package streams;

import java.util.Arrays;
import java.util.List;

public class CheckIfAnyStringStartsWithA {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Banana", "Apple", "Cat", "Andrew");

        boolean result = nameList.stream().anyMatch(word -> word.startsWith("A"));
        System.out.println("Result:" + result );
    }
}
