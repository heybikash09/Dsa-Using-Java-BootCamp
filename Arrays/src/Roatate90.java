public class Roatate90 {
    static void print(int [][]x)
    {
        for(int z[]:x)
        {
            for(int d:z)
            {
                System.out.print(d+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,4,3},{3,2,5,7},{6,4,2,8},{4,2,7,9}};
        System.out.println("Before rotating !!!");
        print(arr);
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr[0].length;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("after Transepose !!!");
        print(arr);
        int st=0;
        int ls=arr[0].length-1;
        while(st<ls)
        {
            for(int k=0;k<arr.length;k++)
            {
                temp=arr[k][st];
                arr[k][st]=arr[k][ls];
                arr[k][ls]=temp;
            }
            st++;
            ls--;
        }
        System.out.println("after rotate 90 degree !!!");
        print(arr);
    }
}
