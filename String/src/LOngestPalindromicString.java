public class LOngestPalindromicString {
    static  String longestPalindrome(String s) {
        int left=0;
        int right=0;
        String z=s.replaceAll("","#");
        System.out.println(z);
        int len=z.length();
        int res=0;
        int curr=0;
        int l=0;
        int r=0;
        for(int i=0;i<len;i++)
        {
            left=i;
            right=i;
            while((left>=0 && right<len-1) && (z.charAt(left)==z.charAt(right)))
            {
                left--;
                right++;
            }
            left+=1;
            right-=1;
            curr=right-left+1-((right-left+2)/2);
            System.out.println(res);
            if(curr>res)
            {
                res=curr;
                l=left;
                r=right;
            }
        }
        return z.substring(l,r+1).replaceAll("#","");
    }
    public static void main(String[] args) {
String x="bb";
        System.out.println(longestPalindrome(x));
    }
}
