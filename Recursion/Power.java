public class Power{
        static  int mySqrt(int x) {
            if(x==0)return 0;
            if(x==1)return 1;
            int l=1,r=x;
            while(l<r)
            {
                int mid=(l+r)/2;
                if(mid*mid==x)
                return mid;
                else if(mid*mid<x)
                        l=mid+1;
                else 
                r=mid-1;
            }
          return 4;
        }
            public static void main(String[] args){
        int num=2147483647;
        System.out.println("Square root of the number is "+mySqrt(num));
    }
}