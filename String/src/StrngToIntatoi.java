public class StrngToIntatoi {
    static int myAtoi(String s) {
        int len=s.length();
        int flag=1;
        long sum=0;
        int i=0;
     while(i<len && s.charAt(i)==' ')
         i++;
    if(s.charAt(i)=='-' || s.charAt(i)=='+')
    {
        flag=s.charAt(i)=='-'?-1:1;
        i++;
    }
     while(i<len && (s.charAt(i)>='0' && s.charAt(i)<='9'))
        {
            sum=sum*10+s.charAt(i)-'0';
            i++;
            if(sum*flag>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(sum*flag<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
    while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
        sum = sum * 10 + (s.charAt(i) - '0');
        i++;
        
        // Check for overflow/underflow
        if (sum * flag > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (sum * flag < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
    }
       return (int)sum*flag;
      
    }
    public static void main(String[] args) {
        String x="-91283472332";
        System.out.println(myAtoi(x));
        //System.out.println(Integer.MIN_VALUE+5+Integer.MAX_VALUE);
    }
}
