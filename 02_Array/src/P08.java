import java.util.LinkedList;

public class P08 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<100;i++) {
            list.add(i+1);
        }
        list.remove(2);
        System.out.println(list);
    }
}
