package arrays;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {

        int[] arr = {1, 24, 5, 4, 3};
        int smallestNo = arr[0];
        int largestNo = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallestNo) {
                smallestNo = arr[i];
            }
            if (arr[i] > largestNo) {
                largestNo = arr[i];
            }
        }
        System.out.println("smallestNo: " + smallestNo);
        System.out.println("largestNo: " + largestNo);
    }
}
