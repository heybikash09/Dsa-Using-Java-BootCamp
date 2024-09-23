import java.util.*;
public class subArrayWithXor {
   static int lenSubArr(int []A,int B)
       /*Brute Force*/
//    {
//
//        int n=A.length;
//        int count=0;
//
//        for(int i=0;i<n;i++)
//        {
//            int xor=0;
//            for(int j=i;j<n;j++)
//            {
//                xor=xor^A[j];
//                if(xor==B)
//                    count++;
//            }
//        }
//        return count;
//    }
    //Optim
    {
     int n=A.length;
     int xor=0;
     int len=0;
     HashMap<Integer,Integer> prefXor=new HashMap<>();
     prefXor.put(0,1);
     for(int i=0;i<n;i++)
     {
         xor=xor^A[i];
         if(prefXor.containsKey(xor^B))
         {
             len=len+prefXor.get(xor^B);
         }
         if(!prefXor.containsKey(xor))
         {
             prefXor.put(xor,1);
         }
         else{

             prefXor.put(xor,prefXor.get(xor)+1);
         }
     }

     return len;
    }
    public static void main(String[] args) {
        int x[] = {5, 6, 7, 8, 9};
        int z = 5;
        System.out.println("The number of subArray which equals to target is "+lenSubArr(x, z));

    }
}
