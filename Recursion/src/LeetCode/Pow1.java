package LeetCode;

public class Pow1 {
    static double myPow(double x, int n) {
//        double z=0;
        if(n==0)
            return 1;
        else if(n>0)
        {
            if(n%2==0)
            {
                double z=myPow(x,n/2);
                return z*z;
            }
        else{
            double  z=myPow(x,n/2);
            return x*z*z;
            }
        }
        else{
            if(n%2==0)
            {
                double z=myPow(x,n/2);
                System.out.println("even->"+z+"  n->"+n);
                return z*z;
            }
            else{
                double  z=myPow(x,n/2);
                System.out.println("odd->"+z+"  n->"+n);
                return (1/x)*z*z;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Power -->"+myPow(2,-2));}
}
