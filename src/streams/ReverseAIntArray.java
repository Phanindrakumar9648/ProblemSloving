package streams;

import java.util.stream.IntStream;

public class ReverseAIntArray {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};

        IntStream.range(0,arr.length)
                .map(num -> arr.length-num-1)
                .forEach(index -> System.out.print(arr[index]));
    }
}
