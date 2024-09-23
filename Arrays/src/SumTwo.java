import java.util.HashMap;

public class SumTwo {
    static int [] TwoSum(int nums[],int target)
    {
    //     int res[]=new int[2];
         int n=nums.length;
//         int i=0;
//         int j=1;
//         while(j!=n)
//         {
//             if(nums[i]+nums[j]==target)
//             {
//                 System.out.println(nums[i]);
//                 res[0]=i;
//                 res[1]=j;
//                 break;
//             }
//             j++;
//             if(j==n)
//             {
//                 i++;
//                 j=i+1;
//             }
//         }
//         return res;
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            res.put(nums[i],i);
        }
        for(int i=0;i<n;i++)
        {
            if(res.containsKey(target-nums[i]) && res.get(target-nums[i])!=i)
            {
                return new int[] {i,res.get(target-nums[i])};
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int arr[]={3,2,3,5,1};
        int tar=6;
        for(int x:TwoSum(arr,tar))
            System.out.print(x+"  ");
    }
}
