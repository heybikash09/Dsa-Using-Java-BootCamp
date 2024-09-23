public class sortEvenOdd {
    static class ListNode {
     int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=head.next;
        while(odd.next!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        while(head!=null)
        {
            System.out.print(head.val+" ");
            head=head.next;
        }
        return null;
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
        System.out.println(oddEvenList(a));
    }
}
