import javax.swing.*;
import java.util.HashMap;
import java.util.HashSet;

public class StartingPointCycle {
     static  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
     }
         static  ListNode detectCycle(ListNode head) {
             if(head==null)
                 return null;
             ListNode left=head;
             ListNode right=head;
           ListNode slow=head;
            ListNode fast=head;
             while(fast!=null && fast.next!=null)
             {
                 fast=fast.next.next;
                 slow=slow.next;
                 if(fast==slow)
                 {
                     break;
                 }
             }
             int len=1;
             ListNode temp=slow.next;
             while(fast!=temp)
             {
                 len++;
                 temp=temp.next;
             }
             while(len>0)
             {
                 right=right.next;
                 len--;
             }
             while(left!=right)
             {
                 left=left.next;
                 right=right.next;
             }

             return left;
      }

         public static void main(String[] args) {
           ListNode a=new ListNode(2);
           ListNode b=new ListNode(3);
           ListNode c=new ListNode(4);
           ListNode d=new ListNode(5);
           ListNode e=new ListNode(6);
           a.next=b;
           b.next=c;
           c.next=d;
           d.next=e;
           e.next=b;
             System.out.println(detectCycle(a).val);

         }
  }

}
