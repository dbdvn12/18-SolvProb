public class DSimpleList {
    Node head;
    Node tail;
    int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null)
            head.prev = newNode;
        head = newNode;
        size++;
        if (head.next == null)
            tail = head;
    }

    public int removeFirst() {
        Node p = head;
        head = p.next;
        int removedata = p.data;
        p.next = null;
        if (head != null)
            head.prev = null;
        size--;
        return removedata;

    }

    public int size() {
        return size;
    }

    public int get(int i) {
        Node p = head;
        while (i > 0) {
            p = p.next;
            i--;
        }
        return p.data;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            addFirst(data);
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public int removeLast() {
        int removeData=tail.data;
        Node p=tail.prev;
        p.next=null;
        tail=p;
        size--;
        return removeData;
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
