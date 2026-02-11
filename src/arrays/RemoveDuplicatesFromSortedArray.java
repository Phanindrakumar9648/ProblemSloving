package arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr ={1,1,2,2,2,3,4,6};
        removeDuplicates(arr);
        for(int num : arr)
        {
            System.out.print(num+"");
        }
    }
    static void removeDuplicates(int[] arr)
    {
        if(arr.length==0) return;
        int j=1;
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[j]=arr[i];
                j++;
            }
        }
    }
}
