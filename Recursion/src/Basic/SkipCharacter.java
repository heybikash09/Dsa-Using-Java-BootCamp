package Basic;
public class SkipCharacter {
    static String skip(String st)
    {
        if(st=="")
            return "";
        else if(st.charAt(0)!='a')
        {
            return st.charAt(0)+skip(st.substring(1));
        }
        else return ""+skip(st.substring(1));
    }
    public static void main(String[] args) {
        String st="aab";
        System.out.println("After removing the character the string is -->"+skip(st));
    }
}
