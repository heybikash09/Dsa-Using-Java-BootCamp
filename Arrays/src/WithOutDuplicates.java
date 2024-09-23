public class WithOutDuplicates {
    public static void main(String[] args) {
        int arr[]={0,0,0,0,0};
        int count=1;
        if(arr.length<2)
        {
            System.out.println("Length = 1");
        }
        else{
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i]!=arr[i+1])
                    count++;
            }
            System.out.println("Length od the array is "+count);
        }
    }
}
