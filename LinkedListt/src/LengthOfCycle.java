import java.util.HashMap;

public class LengthOfCycle {
   static  class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    static int countNodesinLoop(Node head) {
        if(head==null)
            return 0;
        Node slow=head;
        Node fast=head;
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
        Node temp=slow.next;
        while(fast!=temp)
        {
            len++;
            temp=temp.next;
        }
        System.out.println(len);
        return 0;
    }
    public static void main(String[] args) {
    Node a=new Node(2);
        Node b=new Node(9);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=c;
        System.out.println("Length of the cycle in the LinkedLIst is "+countNodesinLoop(a));
    }
}
