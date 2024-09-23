import java.util.*;
public class MaxConsucate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,0,0,0,1,1,1,1,0,1};
        int count=0;
        int res=0;
        int i=0;
        while(i<arr.length)
        {
           if(arr[i]==1)
           {
               count++;
               res=Math.max(res,count);
           }
           else
               count=0;
           i++;
        }
        System.out.println("The maximum consucative number is "+res);
    }
}