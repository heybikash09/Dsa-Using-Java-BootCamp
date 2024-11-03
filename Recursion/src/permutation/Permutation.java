package permutation;

import java.util.ArrayList;

public class Permutation {
    static void permutation(String set,String st)
    {
        if(st.isEmpty())
        {
            System.out.println(set);
            return;
        }
        char current=st.charAt(0);
        int len=set.length();
        int i=0;
        while(i<=len)
        {
            String f=set.substring(0,i);
            String s=set.substring(i);
            permutation(f+current+s,st.substring(1));
            i++;
        }
    }
    public static void main(String[] args) {
        String str="abcd";
    permutation("",str);
    }
}
