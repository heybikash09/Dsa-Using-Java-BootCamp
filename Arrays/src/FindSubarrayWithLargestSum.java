public class FindSubarrayWithLargestSum {
    static int maxSubArray(int[] nums)
    {
        //Brute Force --->>
       int n=nums.length;
        int  sum=0;
        int max=Integer.MIN_VALUE;
//        for(int i=0;i<n;i++)
//        {
//            sum=0;
//            for(int j=i;j<n;j++)
//            {
//                sum=sum+nums[j];
//                if(sum>max)
//                    max=sum;
//            }
//        }
//

        //Optimal
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            if(sum>max)
                max=sum;
            if(sum<0)
                sum=0;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={5,4,-1,7,8};
        System.out.println("The largest sum of subarray "+maxSubArray(arr));
    }
}
