package arrays;

public class SecondLargestElementInArray {

    public static void main(String[] args) {

        int[] nums = {23,1,132,424,231};
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]>firstHighest)
            {
                secondHighest=firstHighest;
                firstHighest=nums[i];
            }
            else if(nums[i]>secondHighest && nums[i]< firstHighest)
            {
                secondHighest = nums[i];
            }
        }
        System.out.println("First Highest: " + firstHighest);
        System.out.println("Second Highest: " + secondHighest);
    }
}
