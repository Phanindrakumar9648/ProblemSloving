package numberproblems;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int missing = findMissing(arr);
        System.out.println("Missing the number: "+missing);
    }

    public static int findMissing(int[] arr) {

        int n = arr.length+1;
        int expectedSum = n* (n+1)/2;
        int actualSum =0;
        for(int num : arr)
        {
            actualSum +=num;
        }
        return expectedSum - actualSum;
    }
}
