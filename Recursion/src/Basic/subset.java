package Basic;

import java.util.ArrayList;

public class subset {
    static ArrayList<String> subSet(String st)
    {
        ArrayList<String> ans=new ArrayList<>();
        if(st.length()==0) {
            ans.add("");
            return ans;
        }
        char current=st.charAt(0);
        ArrayList<String> res=subSet(st.substring(1));
        for(String z:res)
        {
            ans.add(z);
            ans.add(current+z);
        }
        return ans;
    }
    public static void main(String[] args) {
        String st="abc";
        for(String x: subSet(st))
            System.out.print(x+"  ");
    }
}
