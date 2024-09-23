import java.util.*;
public class Sum3 {
    static  List<List<Integer>> threeSum(int[] nums)
        //Brute Force
//    {
//        int n=nums.length;
//        HashSet<List<Integer>> res=new HashSet<>();
//            for(int i=0;i<n;i++)
//            {
//                for(int j=i+1;j<n;j++)
//                {
//                    for (int k=j+1;k<n;k++)
//                    {
//                        if(nums[i]+nums[j]+nums[k]==0)
//                        {
//                          List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
//                          temp.sort(null);
//                          res.add(temp);
//                        }
//                    }
//                }
//            }
//            List<List<Integer>> ans=new ArrayList<>(res);
//            return ans;
//    }
            //Optimal
    {
        int n=nums.length;
        Set<List<Integer>> res=new HashSet<>();
        for(int i=0;i<n;i++)
            {
                Set<Integer> st=new HashSet<>();
                for(int j=i+1;j<n;j++)
                {
                    int third=-(nums[i]+nums[j]);
                  if(st.contains(third))
                  {
                      List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
                      temp.sort(null);
                      res.add(temp);
                  }
                  st.add(third);
                }
            }
        return new ArrayList<>(res);
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
}
