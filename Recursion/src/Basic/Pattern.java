package Basic;

public class Pattern {
    static void printPattern(int num)
    {
        if(num>=0)
        {
            int flag=num;
            while(flag>0)
            {
                System.out.print("* ");
                flag--;
            }
            System.out.println();
            printPattern(num-1);
        }
    }
    public static void main(String[] args) {
        int num=5;
        printPattern(num);
//        StringBuffer x=new StringBuffer("nkjnkfkjbef");
//        System.out.println(x);

    }
}
