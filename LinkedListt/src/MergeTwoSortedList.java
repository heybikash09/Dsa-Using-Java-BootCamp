public class MergeTwoSortedList {
    static class ListNode{
        int val;
     ListNode next;
        ListNode(){}
        ListNode(int val)
        {
            this.val=val;
        }
    }
    static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead=new ListNode();
        ListNode tail = dummyHead;
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;

            }
            else {
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
            System.out.println(tail.val);
        }
        while(list1!=null)
        {
            tail.next=list1;
            list1=list1.next;
            tail= tail.next;
            System.out.println(tail.val);
        }
        while(list2!=null)
        {
            tail.next=list2;
            list2=list2.next;
            tail= tail.next;
            System.out.println(tail.val);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
       ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
       ListNode d=new ListNode(1);
       ListNode e=new ListNode(3);
       ListNode f=new ListNode(4);
        a.next=b;
        b.next=c;
        d.next=e;
        e.next=f;
        //System.out.println(d.val);
        System.out.println(mergeTwoLists(a,d));
    }
}
