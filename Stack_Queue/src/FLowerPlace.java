public class FLowerPlace {
    static  boolean canPlaceFlowers(int[] flowerbed, int n)
    {
        int len=flowerbed.length;
        int count=0;
        if(len==1)
        {
            if(flowerbed[0]==0 && n<2)
                return true;
            else if(flowerbed[0]==1 && n==0)
                return true;
            else return false;
        }
        for(int i=0;i<len;i++)
        {
            if(flowerbed[i]==0)
            {
                if(i!=0 && i!=len-1 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
                {
                    count++;
                    flowerbed[i]=1;
                }
                else if(i==len-1 && flowerbed[i-1]==0)
                {
                    count++;

                }
                else if(i==0 && flowerbed[i+1]==0 )
                {
                    count++;
                    flowerbed[i]=1;
                }
            }
        }
        if(count>=n)
            return true;
        else return false;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,0,0,0,0,0,1,0,0};
        System.out.println("Status -->"+canPlaceFlowers(arr,4));
    }
}
