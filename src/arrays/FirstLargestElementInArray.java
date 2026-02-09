package arrays;

public class FirstLargestElementInArray {

    public static void main(String[] args) {

        int[] nums ={1,24,4,5,346};
        int firstHighest = 0;
        int SecondHighest = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            {
              if(nums[i]>nums[j])
              {
                  firstHighest=nums[i];

              }
            }
        }
        System.out.println(firstHighest);
        System.out.println(SecondHighest);
    }
}
