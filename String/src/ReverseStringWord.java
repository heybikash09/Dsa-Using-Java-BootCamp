import java.util.LinkedHashMap;

public class ReverseStringWord {
    static String reverseWords(String s)
        //Brute Force
    {
        String pq=s.strip();
       String x[]=pq.split("\\s+");
       for(String z:x)
       {
           System.out.println(z);
       }
       StringBuffer res=new StringBuffer();
       int len=x.length;
       for(int i=len-1;i>=0;i--)
       {
           res.append(x[i]);
           if(i!=0)
               res.append(" ");
       }
        return res.toString();
    }

    public static void main(String[] args) {
//        String str="    the   sky    is blue    ";
//        System.out.println(reverseWords(str));

    }
}