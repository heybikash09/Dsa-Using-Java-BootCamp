import java.util.HashMap;

public class LongestSubarrWithZero{
    static int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> prefSum=new HashMap<>();
        int sum=0;
        int len=0;
        prefSum.put(0,-1);
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(!prefSum.containsKey(sum))
            {
                prefSum.put(sum,i);
            }
            else{
                if(prefSum.containsKey(sum))
                    len=Math.max(i-prefSum.get(sum),len);
                prefSum.put(sum,prefSum.get(sum));
            }
        }
        System.out.println(prefSum);
        return len;
    }
    public static void main(String[] args) {
       int arr[]={-1,1,-1,1};
       int n=arr.length;
        System.out.println("The longest subarray which length is "+maxLen(arr,n));
    }
}
