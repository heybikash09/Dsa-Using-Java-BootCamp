public class RomanInteger {
    static  int romanToInt(String s){
    int len=s.length();
    int sum=0;
    for(int i=0;i<len;i++)
    {
        if(s.charAt(i)=='I')
        {
            if(i<len-1)
            {
                if(s.charAt(i+1)=='V')
                {
                    sum+=4;
                    i++;
                }
                else if(s.charAt(i+1)=='X')
                {
                    sum+=9;
                    i++;
                }
                else sum+=1;
            }
            else sum+=1;
        }
        else if(s.charAt(i)=='V')
            sum+=5;
        else if(s.charAt(i)=='X')
        {
            if(i<len-1)
            {
                if(s.charAt(i+1)=='L')
                {
                    sum+=40;
                    i++;
                }
                else if(s.charAt(i+1)=='C')
                {
                    sum+=90;
                    i++;
                }
                else sum+=10;
            }
            else sum+=10;

        }
        else if(s.charAt(i)=='L')
            sum+=50;
        else if(s.charAt(i)=='C')
        {
            if(i<len-1)
            {
                if(s.charAt(i+1)=='D')
                {
                    sum+=400;
                    i++;
                }
                else if(s.charAt(i+1)=='M')
                {
                    sum+=900;
                    i++;
                }
                else sum+=100;
            }
            else sum+=100;
        }
        else if(s.charAt(i)=='D')
            sum+=500;
        else if(s.charAt(i)=='M')
            sum+=1000;
    }
        return sum;
    }
    public static void main(String[] args) {
        String st="DCXXI";
        System.out.println("The integer value of "+st+" is "+romanToInt(st));
    }
}
