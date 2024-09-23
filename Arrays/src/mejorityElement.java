import java.util.HashMap;

public class mejorityElement {
   static int majorityElement(int[] nums) {
    int n=nums.length;
       HashMap<Integer,Integer> res=new HashMap<>();
       for(int i=0;i<n;i++)
       {
           if(!res.containsKey(nums[i]))
           {
                res.put(nums[i],1);
           }
           else{
               res.put(nums[i], res.get(nums[i]) + 1);
           }
       }
       for(int i:res.keySet())
       {
           if(res.get(i)>n/2)
               return i;

       }
       return 1;
    }
    public static void main(String[] args) {
        int arr[]={1};
        System.out.println("The mejority element of the array is "+majorityElement(arr));

    }
}
