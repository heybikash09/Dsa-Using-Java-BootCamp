public class LongestCommonPrefix {
    static  String longestCommonPrefix(String[] x)
    {
        int len=x.length;
        String res="";
        int strLen=0;
        int resLen=0;
        for(int i=1;i<len;i++)
        {
            String str=x[0].substring(0,i);
            for(int j=1;j<len;j++)
            {
                if(!x[j].startsWith(str))
                {
                    res="";
                    break;
                }
            }
            strLen=str.length();
            if(strLen>resLen)
            {
                res=str;
                resLen=strLen;
            }
            System.out.println(res);
        }
        return "res";
    }
    public static void main(String[] args) {
        String st[]={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(st));
    }
}
