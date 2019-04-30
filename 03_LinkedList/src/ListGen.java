public class ListGen<T> {
    NodeGen<T> head;

    public void addFirst(T data) {
        NodeGen<T> newNode=new NodeGen<>(data);
        newNode.next=head;
        head=newNode;
    }

    @Override
    public String toString() {
        String v = "";
        for (NodeGen<T> p = head; p != null; p = p.next) {
            if (v.length() > 0)
                v += "->";
            v += p.data;
        }
        return v;
    }
}
