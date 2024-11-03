import java.util.*;
public class LenghtLongestSubString {
    static int lengthOfLongestSubstring(String s)
    {
        //Brute Force
//        char str[]=s.toCharArray();
//        int n=str.length;
//        HashSet<Character> res=new HashSet<>();
//        int count=0;
//        int len=0;
//        int k=0;
//        int i=0;
//        while(i<n)
//        {
//            if(!res.contains(str[i]))
//            {
//                res.add(str[i]);
//                count++;
//                System.out.println(count);
//                i++;
//            }
//            else{
//                i=k+1;
//                res.clear();
//                count=0;
//                k++;
//            }
//            len=Math.max(len,count);
//        }
//        return len;
        char str[]=s.toCharArray();
        int n=str.length;
        HashSet<Character> res=new HashSet<>();
        int len=0;
        int i=0;
        int j=0;
        while(i<n)
        {
            if(!res.contains(str[i]))
            {
                res.add(str[i]);
                len=j-i+1;
                j++;
            }
            if(j==n-1)
                break;
            else{
                i++;
                j++;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        String str="ab";
        System.out.println("The non repeating sub array length is "+lengthOfLongestSubstring(str));
    }
    }
