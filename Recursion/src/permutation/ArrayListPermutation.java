package permutation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListPermutation {
     static ArrayList<String> permutation(String set, String st)
    {
        if(st.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
           list.add(set);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        char current=st.charAt(0);
        int len=set.length();
        int i=0;
        while(i<=len)
        {
            String f=set.substring(0,i);
            String s=set.substring(i);
            ans.addAll(permutation(f+current+s,st.substring(1)));
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="1234";
        System.out.println(permutation("",str));
        ;
    }
}
