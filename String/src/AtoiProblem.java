public class AtoiProblem {
    static int myAtoi(String s) {
        int len = s.length();
        long  res =0;
        int  flag = 1;
        int i=0;
        if(len==0)
            return 0;
        while(i<len && s.charAt(i)==' ')
            i++;
        if(i<len && (s.charAt(i)=='-' || s.charAt(i)=='+'))
        {
            flag=s.charAt(i)=='-'?-1:1;
            i++;
        }
        while(i<len && s.charAt(i)=='0')
            i++;
        while (i<len && s.charAt(i)>='0' && s.charAt(i)<='9')
        {
            res=res*10+(s.charAt(i)-'0');
            if(res>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(res<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }
        return (int) (flag*res);
    }
    public static void main(String[] args) {
        String st=" -084 ";
        System.out.println("he result is -->"+myAtoi(st));
//        String x="789";
//        int z=Integer.valueOf(x);
//        System.out.println(z);
    }
}
