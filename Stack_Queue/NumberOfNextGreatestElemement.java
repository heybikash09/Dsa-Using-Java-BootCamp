public class NumberOfNextGreatestElemement {
     static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        // code here

        for(int i=0;i<indices.length;i++)
        {
            int count=0;
            int k=indices[i]+1;
            while(k!=N)
            {
                if(arr[indices[i]]<arr[k])
                    count++;
                k++;
            }
            indices[i]=count;
        }
        return indices;
    }
    public static void main(String[] args) {
        int arr[]={3, 4, 2, 7, 5, 8, 10, 6};
        int indices[]={0,5};
        for(int x:count_NGEs(arr.length,arr,2,indices))
            System.out.print(x+"  ");
    }
}
