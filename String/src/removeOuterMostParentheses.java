public class removeOuterMostParentheses {
    static String removeOuterParentheses(String s) {
        int len=s.length();
        System.out.println(len);
        StringBuffer z=new StringBuffer(s);
        int i=0;
        int j=Integer.MIN_VALUE;
        int count=0;
        while(i<len)
        {
            System.out.println(z);
            System.out.println("ind--"+i);
            if(z.charAt(i)=='(')
            {
                count++;
                if(count==1)
                    j=i;
            }
            else{
                count--;
                if(count==0)
                {
                z.deleteCharAt(i);
                z.deleteCharAt(j);
                i=i-2;
                len-=2;
                j=Integer.MIN_VALUE;
                }
            }
                i++;
        }
        return z.toString();
    }
    public static void main(String[] args) {
        String st="(()())(())";
        System.out.println("After remove outer parentheses is "+removeOuterParentheses(st));

    }

}
