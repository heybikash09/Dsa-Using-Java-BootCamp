import java.util.*;

public class MejorityElement3 {
    static  List<Integer> majorityElement(int[] nums) {
            int n=nums.length;
            List<Integer> resArr=new ArrayList<>();
            HashMap<Integer,Integer> res=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                if(!res.containsKey(nums[i]))
                    res.put(nums[i],1);
                else {
                    res.put(nums[i], res.get(nums[i]) + 1);
                }
            }
        for(int i=0;i<n;i++)
        {
            if(res.get(nums[i])>n/3)
            {
                resArr.add(nums[i]);
                res.put(nums[i],0);
            }


        }
        return resArr;
    }
    public static void main(String[] args) {
        int arr[]={1,3,1,1,1,3,23,3,3,2,65};
        System.out.println("The mejority element which appears more than n/3 times  in this arra is "+majorityElement(arr));
    }
}
