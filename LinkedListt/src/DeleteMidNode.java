public class DeleteMidNode {
     static class ListNode {
     int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    static  ListNode deleteMiddle(ListNode head) {
        if(  head==null || head.next==null)
        {
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while( fast!=null && fast.next!=null )
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
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
        ListNode z = deleteMiddle(a);
        while (z != null) {
            System.out.println(z.val);
            z = z.next;
        }
    }
}
