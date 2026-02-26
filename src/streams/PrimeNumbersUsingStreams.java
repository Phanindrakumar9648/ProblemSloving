package streams;

import java.util.stream.IntStream;

public class PrimeNumbersUsingStreams {
    public static void main(String[] args) {

        int n = 6;

        boolean isPrime = n > 1 &&
                IntStream.rangeClosed(2,(int)Math.sqrt(n))
                        .noneMatch(i->n%i==0);

        if (isPrime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");

    }
}
