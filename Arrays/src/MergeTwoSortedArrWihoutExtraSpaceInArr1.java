public class MergeTwoSortedArrWihoutExtraSpaceInArr1 {
   static void sortMerge(int nums1[],int m,int []nums2,int n)
   {
       int i=0;
       int j=0;
       while(i<m)
       {
           if(nums1[i]==0)
           {
               nums1[i]=nums2[j];
           }
       }
   }
    public static void main(String[] args) {
        int arr1[]={1,2,3,0,0,0};
        int m=6;
        int arr2[]={2,5,6};
        int n=3;
        sortMerge(arr1,m,arr2,n);
    }
}
