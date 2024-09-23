import java.util.*;
public class NextGreaterElement_I{
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> con = new HashMap<>();
        Stack<Integer> res = new Stack<>();
        int len = nums2.length;
        for (int i = len - 1; i >= 0; i--) {
            while (!res.isEmpty() && res.peek() < nums2[i])
                res.pop();
            if (res.isEmpty())
                con.put(nums2[i], -1);
            else con.put(nums2[i], res.peek());
            res.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++)
            nums1[i]=con.get(nums1[i]);
        return nums1;
    }
    public static void main(String[] args) {
        int arr[]={4,1,2};
        int store[]={1,3,4,2};
        for(int x:nextGreaterElement(arr,store))
            System.out.print(x+"  ");
    }
}