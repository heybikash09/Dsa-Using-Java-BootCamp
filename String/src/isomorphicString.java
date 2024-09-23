import java.util.HashMap;
import java.util.HashSet;

public class isomorphicString {
    static boolean isIsomorphic(String s, String goal)
  {
    int sLen=s.length();
        int tlen=goal.length();
        HashMap<Character,Character> res=new HashMap<>();
        HashSet<Character> ch=new HashSet<>();
        int i=0;
        while(i<sLen)
        {
            if(!res.containsKey(s.charAt(i)))
            {
                if(!ch.contains(goal.charAt(i)))
                {
                    res.put(s.charAt(i),goal.charAt(i));
                    ch.add(goal.charAt(i));
                }
                else
                    res.put(s.charAt(i),' ');
            }
            i++;
        }
        StringBuffer str=new StringBuffer();
        for(i=0;i<sLen;i++)
        {
            str.append(res.get(s.charAt(i)));
        }
        if(str.toString().equals(goal))
            return true;
        else return false;
//      int gLen=goal.length();
//      int sLen=s.length();
//      String x="";
//      if(gLen!=sLen)
//          return false;
//      if(s==goal)
//          return true;
//      for(int i=1;i<sLen;i++)
//      {
//          if(s.substring(0, i).equals(goal.substring(sLen - i, sLen))) {
//              {
//                  x=goal.substring(sLen - i,sLen)+goal.substring(0,sLen - i);
//                  System.out.println(x);
//                  if(x.equals(s))
//                     return true;
//              }
//          }
//      }
//      return false;
    }
    public static void main(String[] args) {
        String str1="abcde";
        String str2="abcde";
        System.out.println(isIsomorphic(str1,str2));
    }
}
