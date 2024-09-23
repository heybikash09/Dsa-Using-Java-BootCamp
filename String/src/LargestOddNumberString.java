public class LargestOddNumberString {
    static String largestOddNumber(String num)
    {
        int len=num.length();
        for(int i=len-1;i>=0;i--)
        {
            if(Character.getNumericValue(num.charAt(i))%2!=0)
                return num.substring(0,i+1);
        }
        return "";
    }
    public static void main(String[] args) {
        String num="3542";
      //  System.out.println(largestOddNumber(num));
        System.out.println(num.charAt(3)-'0');


    }
}
