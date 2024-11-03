package Basic;
import java.util.ArrayList;
public class subsiquenceContigeous {
    static void contigeousSubSet(String st,String ch)
    {
        if(st.isEmpty())
        {
            System.out.println(ch);
            return;
        }
        char current=st.charAt(0);
        contigeousSubSet(st.substring(1),ch+current);
        contigeousSubSet(st.substring(1),ch);
    }
    public static void main(String[] args) {
        String st="abc";
        contigeousSubSet(st,"");
    }
}
