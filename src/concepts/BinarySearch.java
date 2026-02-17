package concepts;


public class BinarySearch {
    public static void main(String[] args) {

        int[] num = {5, 7, 8, 9, 10};
        int target = 9;

        int index = binarySearch(num, target);
        if (index != -1) {
            System.out.println("Found the index: " + index);
        } else {
            System.out.println("Not Found the index: " + index);
        }
    }

    public static int binarySearch(int[] num, int target) {

        int left = 0;
        int right = num.length - 1;
        while (left <= right) {
            int mean = (left + right) / 2;
            if (num[mean] == target) {
                return mean;
            } else if (num[mean] < target) {
                left = mean + 1;
            } else {
                right = mean - 1;
            }

        }
        return -1;
    }
}
