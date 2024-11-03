package LeetCode;

import java.util.ArrayList;

public class digitToStringCombination {

    //Printing of the combination
//    static void digitToStringComb(String set,String dig)
//    {
//        if(dig.isEmpty())
//        {
//            System.out.print(set+"  ");
//            return;
//        }
//        int n=dig.charAt(0)-48;
//        int num=97+((n-1)*3);
//        for(int i=num;i<=num+2;i++)
//        {
//            digitToStringComb(set+(char)i,dig.substring(1));
//        }
//    }
    //Return the combination bt arrayList
    static ArrayList<String> combDigitOfString (String set,String dig)
    {
        if(dig.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(set);
            return list;
        }
        ArrayList<String> res=new ArrayList<>();
        int n=dig.charAt(0)-48;
       int num=97+((n-1)*3);
        for(int i=num;i<=num+2;i++)
        {
            res.addAll(combDigitOfString(set+(char)i,dig.substring(1)));
        }
        return res;
    }
    public static void main(String[] args) {
        String x="23";
        System.out.println(combDigitOfString("",x));
    }
}
