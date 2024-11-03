import java.util.Arrays;

public class SquareOfSortedArray {
    static  int[] sortedSquares(int[] nums) {
       // brute Forcew
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;

    }
    public static void main(String[] args) {
            int arr[]={-4,-1,0,3,10};
            for(int z:sortedSquares(arr))
                System.out.println(z);
    }
}
