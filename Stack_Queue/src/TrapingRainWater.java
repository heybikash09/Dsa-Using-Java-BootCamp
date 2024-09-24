public class TrapingRainWater {
    static int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lMax=height[l],rMax=height[r],total=0;
        while(l<=r)
        {
            if(lMax<=rMax)
            {
                if(height[l]<=lMax)
                    total+=lMax-height[l];
                else
                    lMax=height[l];
                l++;
            }
            else{
                if(height[r]<=rMax)
                    total+=rMax-height[r];
                else rMax=height[r];
                r--;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The bar container can contain water-->"+trap(arr));
    }
}