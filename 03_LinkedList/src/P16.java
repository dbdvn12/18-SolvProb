public class P16 {
    public static void main(String[] args) {
        DSimpleList list = new DSimpleList();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(9);
        list.addLast(8);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
