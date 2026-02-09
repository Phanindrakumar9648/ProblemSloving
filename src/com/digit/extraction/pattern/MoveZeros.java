package com.digit.extraction.pattern;

public class MoveZeros {

    public static void moveZeros(int[] nums) {
        int writeIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }

        while (writeIndex < nums.length) {
            nums[writeIndex] = 0;
            writeIndex++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeros(nums);

        // print result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
