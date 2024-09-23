import java.util.HashMap;

public class ValidAnagram {
    static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sRes = new HashMap<>();
        HashMap<Character, Integer> tRes = new HashMap<>();
        int tLen = t.length();
        int sLen=s.length();
        for (int i = 0; i < sLen; i++) {
            if (!sRes.containsKey(s.charAt(i)))
                sRes.put(s.charAt(i), 1);
            else {
                sRes.put(s.charAt(i), sRes.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < tLen; i++) {
            if (!tRes.containsKey(t.charAt(i)))
                tRes.put(t.charAt(i), 1);
            else {
                tRes.put(t.charAt(i), tRes.get(t.charAt(i)) + 1);
            }
        }
        return sRes.equals(tRes);
    }
    public static void main(String[] args) {
        String s="a";
        String t="ab";
        System.out.println(isAnagram(s,t));
    }
}
