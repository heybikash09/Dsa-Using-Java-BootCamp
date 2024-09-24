import java.util.Stack;

public class sumOfSubArrayRange {
    static long subArrayRanges(int[] nums) {
       // Brute Force
        int len=nums.length;
        int k;
//        Stack<Integer> res=new Stack<>();
        long sum=0;
        int max;
//        for(int i=0;i<len;i++)
//        {
//            k=i+1;
//            max=nums[i];
//            res.push(nums[i]);
//            while(k<len)
//            {
//                if(nums[k]<res.peek())
//                    res.push(nums[k]);
//                if(max<nums[k])
//                    max=nums[k];
//                sum+=max-res.peek();
//                k++;
//            }
//            res.clear();
//        }
//       // System.out.println(sum);
        int min;
        for(int i=0;i<len;i++)
        {
            max=nums[i];
            min=nums[i];
            k=i+1;
            while(k<len)
            {
                max=Math.max(max,nums[k]);
                min=Math.min(min,nums[k]);
                sum+=max-min;
                k++;
            }
        }
        System.out.println(sum);
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={4,-2,-3,4,1};
        System.out.println("The sum of sub array range "+subArrayRanges(arr));
    }
}
