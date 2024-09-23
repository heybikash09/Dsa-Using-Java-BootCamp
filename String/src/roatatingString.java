public class roatatingString {
    static  boolean rotateString(String s, String goal)
    {
        int gLen=goal.length();
        int sLen=s.length();
        if(gLen!=sLen)
            return false;
        if(s==goal)
            return true;
      for(int i=1;i<sLen;i++)
      {
          if(s.substring(0, i).equals(goal.substring(sLen - i, sLen)))
              return true;
      }
      return false;
    }
    public static void main(String[] args) {
        String s="bbbacddceeb";
        String goal="ceebbbbacdd";
//System.out.println(rotateString(s,goal));
        System.out.println('('&')');
    }
}
