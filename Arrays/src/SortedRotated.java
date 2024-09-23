import java.util.Arrays;

public class SortedRotated {
    static boolean check(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int point = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                point = i + 1;
                break;
            }

        }
        System.out.println(point);
        for (int i = 0; i < n; i++) {
            res[i] = nums[(i + point) % n];
        }
       for(int i=0;i<n-1;i++)
       {
           if(res[i]>res[i+1])
               return false;
       }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,1,2};
        if (check(arr))
            System.out.println("The array was original sorted");
        else
            System.out.println("The array was not origimal sorted !!");
    }
}
