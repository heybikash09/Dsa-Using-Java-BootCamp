public class ArrayToLinkedList {
   static  class Node {
        int data;
        Node next;

        Node() { }
        Node(int d) { data = d; }  //constructor to create a new node
    }
    static  Node constructLL(int arr[]) {
        // code here
        int len=arr.length;
        Node head=new Node();
        Node tail=head;
        for(int i=0;i<len;i++)
        {
            Node a=new Node(arr[i]);
            tail.next=a;
            tail=a;
        }
        return head.next;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(constructLL(arr).data);

    }
}
