import java.util.*;
public class NextGreaterElement_II {
    static int[] nextGreaterElements(int[] nums) {
        //Brute Force
        //      int k;
        // int len = nums.length;
        // int res[] = new int[len];
        // for (int i = len - 1; i >= 0; i--) {
        //     k = i + 1;
        //     while (k != len+i) {
        //         if (nums[k % len] > nums[i]) {
        //             res[i] = nums[k % len];
        //             break;
        //         } else k++;
        //     }
        //     if (k == len + i)
        //         res[i] = -1;
        // }
        // return res;

        // Optimal
        int len = nums.length;
        Stack<Integer> res = new Stack<>();
        int resultArr[] = new int[len];
        for (int i = (len * 2) - 1; i >= 0; i--) {
            //     while(!res.isEmpty() && res.peek()<nums[i%len])
            //     res.pop();
            //     if(!res.isEmpty())
            //     con.put(nums[i%len],-1);
            //     else
            //         con.put(nums[i%len],res.peek());
            // res.push(nums[i%len]);
            while (!res.isEmpty() && res.peek() <= nums[i % len])
                res.pop();
            if (res.isEmpty())
                resultArr[i % len] = -1;
            else resultArr[i % len] = res.peek();
            res.push(nums[i % len]);
        }
        return resultArr;
    }
      public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        for(int x:nextGreaterElements(arr))
            System.out.print(x+"  ");
    }
}
