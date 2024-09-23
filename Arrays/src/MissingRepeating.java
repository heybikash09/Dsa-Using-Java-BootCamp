import java.util.HashMap;

public class MissingRepeating {
    static int[] findTwoElement(int arr[], int n) {
        HashMap<Integer,Integer> res=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<n;i++)
        {
            if(!res.containsKey(arr[i]))
            {
                res.put(arr[i],1);
            }
            else{
                ans[0]=arr[i];
            }
        }
        System.out.println(res);
        for(int i=1;i<=n;i++)
        {
            if(!res.containsKey(i))
                ans[1]=i;
        }
      return ans;
    }
    
    public static void main(String[] args) {

        int arr[]={2,2};
        for(int x:findTwoElement(arr,arr.length))
        {
            System.out.print(x+"  ");
        }
    }
}
