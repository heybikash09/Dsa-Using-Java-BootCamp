public class DeleteNode {
    static class ListNode{
        int val;
       ListNode next;
        ListNode(){}
        ListNode(int val)
        {
            this.val=val;
        }
    }
    static  void deleteNode(ListNode node) {
            node.val=node.next.val;
            node.next=node.next.next;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(4);
        ListNode b=new ListNode(5);
        ListNode c=new ListNode(1);
        ListNode d=new ListNode(2);
        a.next=b;
        b.next=c;
        c.next=d;
        deleteNode(b);


    }
}
