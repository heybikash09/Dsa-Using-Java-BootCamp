public class Demo {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return;
        int i=0,j=0,k=0;
        int res[]=new int[m+n];
        while(i<n && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                res[k++]=nums1[i++];
            System.out.println((k-1)+"  "+res[k-1]);
            }
            else
            {
                res[k++]=nums2[j++];
                System.out.println((k-1)+"  "+res[k-1]);
            }
        }
        while(i<n)
        {
            res[k++]=nums1[i++];
            System.out.println((k-1)+"  "+res[k-1]);
        }
        while(j<n)
        {
            res[k++]=nums2[j++];
            System.out.println((k-1)+"  "+res[k-1]);
        }
        i=0;
        k=0;
        while(i<m+n)
        {
            nums1[i++]=res[k++];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,0,0,0};
        int arr2[]={2,5,6};
        merge(arr,3,arr2,3);
    }
}
