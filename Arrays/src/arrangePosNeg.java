public class arrangePosNeg {
    static int[] arrange(int nums[])
    {
     int n=nums.length;
//     int pos[]=new int[n/2];
//     int neg[]=new int[n/2];
//     int p=0;
//     int q=0;
//     for(int i=0;i<n;i++)
//     {
//         if(nums[i]>0)
//             pos[p++]=nums[i];
//         else neg[q++]=nums[i];
//
//     }
//     p=0;
//     q=0;
//     for(int i=0;i<n;i++)
//     {
//         if(i%2==0)
//             nums[i]=pos[p++];
//         else nums[i]=neg[q++];
//     }
        int res[]=new int[n];
        int p=0;
        int q=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                res[p]=nums[i];
                p+=2;
            }
            else{
                res[q]=nums[i];
                q+=2;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        for(int x:arrange(arr))
            System.out.print(x+"  ");
    }
}
