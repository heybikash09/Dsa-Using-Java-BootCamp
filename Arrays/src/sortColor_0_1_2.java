import java.util.HashMap;

public class sortColor_0_1_2 {
    static int [] setColor(int nums[])
    {
        int n=nums.length;
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<n;i++) {
            if (!res.containsKey(nums[i]))
                res.put(nums[i], 1);
             else
                res.put(nums[i], res.get(nums[i]) + 1);
        }
        System.out.println(res);
        int k=0;
        int p=0;
        while(res.containsKey(0))
        {
            if(k<res.get(0)) {
                nums[p++] = 0;
                k++;
            }
            else break;
            System.out.println(res.get(0));
        }
        k=0;
        while(res.containsKey(1))
        {
            if(k<res.get(1)) {
                nums[p++] = 1;
                k++;
            }
           else break;
        }
        k=0;
        while(res.containsKey(2))
        {
            if(k<res.get(2)) {
                nums[p++] = 2;
                k++;
            }
            else break;
            System.out.println(res.get(2));
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[]={1};
        for(int x:setColor(arr))
            System.out.print(x+" ");
    }
}
