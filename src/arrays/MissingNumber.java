package arrays;


import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        int n = 9;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        int missing = expectedSum - actualSum;
        System.out.println("Missing number: " + missing);

        // Streams
        int totalExpectedSum = IntStream.rangeClosed(1,n).sum();
        int totalActualSum = Arrays.stream(arr).sum();
        int missingNumber = totalExpectedSum - totalActualSum;

        System.out.println("Missing number is: " + missingNumber);
    }



}
