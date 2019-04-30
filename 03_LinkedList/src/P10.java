public class P10 {
    public static void main(String[] args) {
        ListGen<Integer> listA=new ListGen<>();
        listA.addFirst(1);
        listA.addFirst(2);
        listA.addFirst(3);
        System.out.println(listA);
        ListGen<String> listB=new ListGen<>();
        listB.addFirst("Korea");
        listB.addFirst("Japan");
        listB.addFirst("China");
        System.out.println(listB);
        ListGen<Boolean> listC=new ListGen<>();
        listC.addFirst(true);
        listC.addFirst(true);
        listC.addFirst(false);
        System.out.println(listC);
    }
}
