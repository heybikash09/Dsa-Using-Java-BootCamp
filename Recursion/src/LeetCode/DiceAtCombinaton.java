package LeetCode;

public class DiceAtCombinaton {
    static void DiceThrough(String set,int res)
    {
        if(res==0)

        {
            System.out.println(set);
            return;
        }
        for(int i=1;i<=res;i++)
        {
            DiceThrough(set+i,res-i);
        }
    }
    public static void main(String[] args) {
        int res=4;
       DiceThrough("",res);
       // String x="bk";

    }
}
