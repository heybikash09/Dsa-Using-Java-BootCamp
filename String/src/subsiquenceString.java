import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class subsiquenceString {
    static String ssq(String st)
    {
        int len=st.length();
       StringBuffer res=new StringBuffer();
       HashMap<Character,Integer> freq=new HashMap<>();
      for(int i=0;i<len;i++){
          if(!freq.containsKey(st.charAt(i)))
              freq.put(st.charAt(i),1);
          else freq.put(st.charAt(i),freq.get(st.charAt(i))+1);
      }
        System.out.println(freq);
      ArrayList<Character> temp=new ArrayList<>(freq.keySet());
      Collections.sort(temp,(a,b)->freq.get(a).compareTo(freq.get(b)));
        int n=temp.size();
      for(int i=n-1;i>=0;i--)
      {
         for(int j=0;j<freq.get(temp.get(i));j++)
         {
             res.append(temp.get(i));
         }
      }
        return res.toString();
    }
    public static void main(String[] args) {
       String st="absdknlndlnfl";
      // System.out.println(ssq(st));
    }
}
