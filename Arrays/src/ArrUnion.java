import java.util.*;
public class ArrUnion {
//    static  ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
//    {
//
//    }
    public static void main(String[] args) {
        int arr1[]={0,0,2,3,3,3,3,4,7};
        int arr2[]={0,0,3,5,7,9};
        int n=arr1.length;
        int m=arr2.length;
        ArrayList<Integer> res=new ArrayList<>(n+m);
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(arr1[i]==arr2[j])
            {
                if(!res.contains(arr1[i]))
                res.add(arr1[i]);
                i++;
                j++;
            }
            else if((arr1[i] < arr2[j]))
            {
                if(!res.contains(arr1[i]))
                res.add(arr1[i]);
                i++;
            }
            else if(!res.contains(arr2[j]))
            {
                res.add(arr2[j]);
                j++;
            }
        }
        while(i<n)
        {
            if(!res.contains((arr1[i])))
            {
                res.add(arr1[i]);
                i++;
            }
        }
        while(j<m)
        {
            if(!res.contains((arr2[j])))
            {
                res.add(arr2[j]);
                j++;
            }
        }
        System.out.println(res);
    }
}
