import java.util.ArrayList;
import java.util.Arrays;

public class palindromicList {
    static  class ListNode {
     int val;
    ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static boolean isPalindrome(ListNode head) {
   ArrayList<Integer> z=new ArrayList<>();

        while(head!=null)
        {
            z.add(head.val);
            head=head.next;
        }
        while(!z.isEmpty())
        {
            if(z.getFirst().equals(z.getLast()))
            {
                if(z.size()==1)
                    z.removeFirst();
                else{
                    System.out.println(z.size());
                    z.removeFirst();
                    z.removeLast();
                }
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
    ListNode a=new ListNode(9);
    ListNode b=new ListNode(8);
    ListNode c=new ListNode(9);
    ListNode d=new ListNode(8);
    ListNode e=new ListNode(9);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
        System.out.println(isPalindrome(a));
    }
}
