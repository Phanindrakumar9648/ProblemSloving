package arrays;


public class TwoSumSortedArray {
    public static void main(String[] args) {

        int[] num = {1, 23, 4, 1, 1, 4, 5, 53};
        int target = 5;


        int left = 0;
        int right = num.length - 1;
        boolean found = false;
        while (left < right) {
            int sum = num[left] + num[right];
            if (sum == target) {
                System.out.println("Pair found: " + left + " , " + right);
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        if (!found) {
            System.out.println("No pair found");
        }
    }
}
