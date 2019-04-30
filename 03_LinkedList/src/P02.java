public class P02 {
    public static void main(String[] args) {
        Node head=null;
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        printList(head);

        Node newNode = new Node(7);
        newNode.next=head;
        head=newNode;
        printList(head);


    }
    private static void printList(Node head) {
        for (Node p=head; p != null; p=p.next) {
            if(p==head)
                System.out.print(p.data);
            else System.out.print( "->"+p.data);
        }
        System.out.println();
    }
}
