package streams;

import java.util.stream.IntStream;

public class FindVowelsinStr {

    public static void main(String[] args) {

        String str = "PhanindraKumar";
        IntStream.range(0, str.length()).filter(i -> {

            char ch = Character.toLowerCase(str.charAt(i));
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }).forEach(i -> System.out.println("Vowles of index:" + i));
    }
}
