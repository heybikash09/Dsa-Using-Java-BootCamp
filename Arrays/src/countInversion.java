public class countInversion {
    static long inversionCount(long arr[], int n)
    {
     long count=0;
     for(int i=0;i<n;i++)
     {
         for(int j=i+1;j<n;j++)
         {
             if(arr[i]>arr[j])
                 count++;
         }
     }

        return count;
    }
    public static void main(String[] args) {
        long arr[]={10};
        int n=arr.length;
        System.out.println(inversionCount(arr,n));
    }
}
