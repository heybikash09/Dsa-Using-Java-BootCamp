public class MaxConsucative {
    static int findMaxConsecutiveOnes(int[] nums)
    {
        int res=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else count=0;
            if(count>res)
                res=count;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,1,1,0,0,0,1,1};
        System.out.println("The maximum consucative binary number is "+findMaxConsecutiveOnes(arr));
    }
}
