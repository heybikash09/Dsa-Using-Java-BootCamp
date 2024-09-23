import java.util.*;
public class ArrayLeader {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> res=new ArrayList<>();
        int k=0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                res.add(k++,arr[i]);
                max=arr[i];
            }
        }
        System.out.println(res);
        System.out.println(res.get(2));
         k=0;
        int len=res.size();
        int temp=0;
       while(k<len/2)
       {
           temp=res.get(k);
           res.set(k,res.get(len-k-1));
           res.set(len-k-1,temp);
           k++;
       }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
//        for (int x : leaders(n, arr))
            System.out.print(leaders(n, arr));
//        ArrayList<Integer> res=new ArrayList<>();
//        res.add(5);
//        int p=4;
//        int k=4;
//
//        int x=res.get(p-k);
//        System.out.println(x);

    }
}
