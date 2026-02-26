package streams;

import java.util.stream.IntStream;

public class PrintOddNumberOfWord {

    public static void main(String[] args) {
        String str = "Phani";

        IntStream.range(0,str.length())
                .filter(i->i%2!=0)
                .mapToObj(str::charAt)
                .forEach(System.out::println);
    }
}
