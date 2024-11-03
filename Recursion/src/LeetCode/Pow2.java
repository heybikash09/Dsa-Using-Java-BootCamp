package LeetCode;

public class Pow2 {
    static boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        else if(n==0)
            return false;
        else if(n%2!=0)
            return false;
        else
            return isPowerOfTwo(n/2);
    }
    public static void main(String[] args) {
        System.out.println("Status -->"+isPowerOfTwo(128));
    }
}
