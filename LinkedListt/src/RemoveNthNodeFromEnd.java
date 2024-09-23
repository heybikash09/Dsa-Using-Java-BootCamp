public class RemoveNthNodeFromEnd {
    static  class ListNode {
        int val;
     ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }}
        static  ListNode removeNthFromEnd(ListNode head, int n) {
            int count=1;
            ListNode dmHead=null;
            ListNode tail=null;
            dmHead=head;
            tail=head;
            while(tail.next!=null)
            {
                count++;
                tail=tail.next;
            }
            if(count==1)
                return null;
            if(count-n==0)
            {
                if(head.next!=null)
                {
                    head=head.next;
                }
                return head;
            }
            else{
                //   System.out.println(dmHead.val);
                int i=0;
                while(i!=count-n-1)
                {
                    dmHead=dmHead.next;
                    i++;
                }
                if(i==0 && dmHead.next!=null)
                {
                    dmHead.next=dmHead.next.next;
                    return head;
                }
                else if(dmHead.next!=null)
                {
                    dmHead.next=dmHead.next.next;
                }
            }
            return head;
        }
    public static void main(String[] args) {
        ListNode a=new ListNode(2);
        ListNode b=new ListNode(3);
//        ListNode c=new ListNode(4);
//        ListNode d=new ListNode(5);
//        ListNode e=new ListNode(6);
        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
        System.out.println(removeNthFromEnd(a,1));
    }
}
