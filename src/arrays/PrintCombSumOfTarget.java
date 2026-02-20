package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class PrintCombSumOfTarget {

    public static void main(String[] args) {

        //Streams
        List<Integer> num = Arrays.asList(1,23,4,16,89,0,2,20,5);
        int target = 25;

        int[][] result = num.stream().flatMap(x->num.stream()
                .filter(y-> x+y==target && x<y)
                .map(y-> new int[]{x,y}))
                .toArray(int[][]::new);

        // Print 2D array
        System.out.println(Arrays.deepToString(result));

        List<int[]> resultList = new ArrayList<>();

        //Brute force
        int[] numbers = {1, 23, 4, 16, 89, 0, 2, 20, 5};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {
                    resultList.add(new int[]{numbers[i], numbers[j]});
                }
            }
        }

        // Convert List<int[]> to int[][]
        int[][] results = resultList.toArray(new int[0][]);

        System.out.println(Arrays.deepToString(result));
    }
}
