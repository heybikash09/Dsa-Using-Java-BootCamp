public class ReverseList {
      static  class ListNode {
          int val;
          ListNode next;
         ListNode() {}
        ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    static  ListNode reverseList(ListNode head) {
    ListNode dummyHead=null;
    ListNode next=null;
    while(head!=null)
    {
      next=head.next;
      head.next=dummyHead;
      dummyHead=head;
      head=next;
    }
        System.out.println(dummyHead.val);
    return dummyHead;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(reverseList(a).val);
    }
}
