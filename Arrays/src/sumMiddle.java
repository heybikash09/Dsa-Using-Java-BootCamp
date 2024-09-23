public class sumMiddle {
    static int SumofMiddleElements(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int res[]=new int[2*n];
        int k=0;
        int i=0,j=0;
        while(i<n && j<n)
        {
            if(arr1[i]<arr2[j])
            {
                res[k++]=arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                res[k++]=arr2[j];
                j++;
            }
            else{
                res[k++]=arr1[i];
                i++;
            }
        }
        while(i<n)
        {
            res[k++]=arr1[i];
            i++;
        }
        while(j<n)
        {
            res[k++]=arr2[j];
            j++;
        }
        return res[n-1]+res[n];
    }
    public static void main(String[] args) {
        int arr1[]={1, 2, 4, 6, 10};
        int arr2[]={4, 5, 6, 9, 12};
        System.out.println(SumofMiddleElements(arr1,arr2));
    }
}
