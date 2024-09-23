import java.util.List;

public class RotateList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        if(head.next==null || k==0)
            return head;
        int count=0;
        ListNode tail=head;
        ListNode prev=null;
        ListNode conH=head;
        while(tail.next!=null)
        {
            count++;
            tail=tail.next;
        }
        count=count+1;
        int skip=count-(k%count);
        if(skip==0)return head;
        while(skip>0)
        {
            prev=conH;
            conH=conH.next;
            skip--;
        }
        tail.next=head;
        prev.next=null;
        return conH;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
//        ListNode c = new ListNode(4);
//        ListNode d = new ListNode(5);
//        ListNode e = new ListNode(6);
        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
        System.out.println(rotateRight(a,2));
    }
}
