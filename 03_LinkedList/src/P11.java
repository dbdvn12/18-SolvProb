public class P11 {
    public static void main(String[] args) {
        SimpleList list=new SimpleList();
        for (int i=1; i <=5; i++) list.addFirst(i);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}
