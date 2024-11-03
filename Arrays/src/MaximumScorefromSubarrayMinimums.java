import java.lang.reflect.Array;
import java.util.*;

public class MaximumScorefromSubarrayMinimums {
    static  int pairWithMaxSum(List<Integer> arr) {
        int len=arr.size();
        int res=0;
        //Brute Force ---->>>
//       for(int i=0;i<len;i++)
//       {
//           int max=arr.get(i);
//           int min=arr.get(i);
//           for(int j=i+1;j<len;j++)
//           {
//               max=Math.max(max,arr.get(j));
//               min=Math.min(min,arr.get(j));
//               if(i!=j && res<(max+min))
//                   res=max+min;
//           }
//       }
        
                return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer> lt=new ArrayList<>();
        //System.out.println("The sum "+pairWithMaxSum(lt));
        lt.addFirst(4);
        lt.addFirst(9);
        lt.addFirst(89);
        System.out.println(lt);

    }
}
