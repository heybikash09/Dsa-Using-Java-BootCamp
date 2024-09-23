public class PrintRotateArray {
    static void rotate(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n];
        // int kt=k%n;
        int rt=n-k;
        for(int i=0;i<n;i++)
        {
            res[i]=nums[(i+rt)%n];
        }
        for(int i=0;i<n;i++)
        {
            if(i==0)
                System.out.print("[");
            System.out.print(res[i]);
            if(i<n-1)
                System.out.print(",");
            if(i==n-1)
                System.out.print("]");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr,k);
    }
}
