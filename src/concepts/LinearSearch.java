package concepts;

public class LinearSearch {
    public static void main(String[] args) {

        int[] num = {5, 7, 8, 9, 10};
        int target = 9;

        int index = linearSearch(num, target);
        if (index != -1) {
            System.out.println("Found the index: " + index);
        } else {
            System.out.println("Not Found the index: " + index);
        }


    }

    public static int linearSearch(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            if (target == num[i]) {
                return i;
            }

        }
        return -1;
    }
}
