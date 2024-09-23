import java.util.HashSet;

public class HappyNumber {
    static  boolean isHappy(int n) {
        HashSet<Integer> occ=new HashSet<>();
        int sum=0;int rem=0;
        while(n!=0)
        {
        rem=n%10;
        sum=sum+(rem*rem);
            n/=10;
        if(n==0)
        {
            if(sum==1)
                return true;
            if(!occ.contains(sum))
            {
                occ.add(sum);
                n=sum;
                sum=0;
            }
            else return false;
        }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println("Status-->"+isHappy(n));
    }
}
