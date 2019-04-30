public class P14 {
    public static void main(String[] args) {
        SimpleList list=new SimpleList();
        for (int i = 0; i < 5; i++) list.addLast(i);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
