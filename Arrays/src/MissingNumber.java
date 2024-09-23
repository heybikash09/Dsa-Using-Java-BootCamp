public class MissingNumber {
    static int missingNumber(int[] nums) {
        int n=nums.length;
        int res[]=new int[n+1];
        // int k=0;
        int x=0;
        for(int i=0;i<n+1;i++)
        {
            res[i]=i;
        }
        for(int i=0;i<n;i++)
        {
            res[nums[i]]=Integer.MAX_VALUE;
        }
        for(int i=0;i<n+1;i++)
        {
            if(res[i]!=Integer.MAX_VALUE)
            {
                x=res[i];
                break;
            }

        }
        return x;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println(missingNumber(arr));
    }
}
