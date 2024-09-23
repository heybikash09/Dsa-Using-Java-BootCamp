public class MiddleNode {
    static  class ListNode {
   int val;
    ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    static  ListNode middleNode(ListNode head) {
        int count=0;
        ListNode dummyHead=new ListNode();
        dummyHead=head;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        int len=count;
        System.out.println(dummyHead.val);
        System.out.println(len);
        count=0;
        while(dummyHead!=null)
        {
            if(count==(len/2))
                return dummyHead;
            else
             dummyHead=dummyHead.next;
            count++;
        }
       return null;
    }
    public static void main(String[] args) {
       ListNode a=new ListNode(2);
        ListNode b=new ListNode(5);
        ListNode c=new ListNode(7);
        ListNode d=new ListNode(12);
        ListNode e=new ListNode(15);
        ListNode f=new ListNode(17);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println(middleNode(a).val);
    }
}
