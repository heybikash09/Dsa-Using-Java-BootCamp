import java.util.HashMap;

public class lengthSubArrayEqualsum {
    static int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> prefSum=new HashMap<>();
        prefSum.put(0,1);
        int sum=0;
        int count=0;
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            if(!prefSum.containsKey(sum))
            prefSum.put(sum,1);
            else
                prefSum.put(sum,prefSum.get(sum)+1);
            if(prefSum.containsKey(sum-k))
                flag=true;
            if(flag && sum-k!=nums[i]){
                System.out.println("Index"+i);
                System.out.println(nums[i]);
                count=count+prefSum.get(sum-k);
            }
            flag=false;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={-1,-1,1};
        int target=0;
        System.out.println("The no of subarray which equals to the target is "+subarraySum(arr,target));
    }
}
