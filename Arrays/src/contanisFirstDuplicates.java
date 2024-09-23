import java.util.HashSet;

public class contanisFirstDuplicates {
    static  boolean containsDuplicate(int[] nums)
    {
        int n=nums.length;
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!res.contains(nums[i]))
                res.add(nums[i]);
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,2};
        if(containsDuplicate(arr))
        System.out.println("The array contains duplicates element !! ");
        else
            System.out.println("The array doesn't contain any duplicates !!");
    }
}
