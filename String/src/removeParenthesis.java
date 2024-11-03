public class removeParenthesis {
    static String removeOuterParentheses(String s) {
        int len=s.length();
        StringBuffer comp=new StringBuffer();
        StringBuffer res=new StringBuffer();
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(count>0)
                comp.append(s.charAt(i));
            else if(!comp.isEmpty())
            {
                res.append(comp);
                System.out.println("comp-->"+comp.substring(0,res.length()-1));
                comp.setLength(0);
            }
            if(s.charAt(i)=='(')
                count++;
            else
                count--;
            System.out.println(i+"  "+count);
        }
        return res.toString();

    }
    public static void main(String[] args) {
        String st="(()())(())";
        System.out.println("res-->"+removeOuterParentheses(st));
//        StringBuffer res=new StringBuffer();
//        res.append("abcde");
//        System.out.println(res);
//        System.out.println(res.length());
//        System.out.println(res.substring(0,res.length()-1));
    }
}
