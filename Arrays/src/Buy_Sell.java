public class Buy_Sell {
    static int maxProfit(int nums[])
    {
    int n=nums.length;
    int maxProf=0;
    int minPrice=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                if(nums[i]<minPrice)
                    minPrice=nums[i];
                else if(nums[i]-minPrice>maxProf)
                    maxProf=nums[i]-minPrice;

            }
        return maxProf;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println("The maximum profit we can get is "+maxProfit(arr));
    }
}
