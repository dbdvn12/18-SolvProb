public class SimpleList {
    Node head;
    Node tail;
    int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void removeFirst() {
        if (head == null)
            System.out.println("does not exist");
        else {
            Node p = head;
            head=null;
            head = p.next;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public int get(int i) {
        Node p=head;
        while(i>0) {
            p=p.next;
            i--;
        }
        return p.data;
    }

    public void addLast(int i) {
        /*Node newNode=new Node(i); //head만 사용 : O(n)
        for (Node p = head; p != null; p = p.next) {
            if (p.next == null) {
                p.next=newNode;
                p=p.next;
            }
        }*/
        Node newNode=new Node(i);   //tail 사용 : O(1)
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    public void removeLast() {  //tail의 이전노드를 찾기 위해 O(n)의 시간을 소요한다.
        for(Node p=head;p!=null;p=p.next) {
            if(p.next==tail) {
                p.next = null;
                tail=p;
            }
        }
        size--;
    }

    @Override
    public String toString() {
        String v = "";
        for (Node p = head; p != null; p = p.next) {
            if (v.length() > 0) v += "->";
            v += p.data;
        }
        return v;
    }
}
