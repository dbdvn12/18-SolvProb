import java.util.LinkedList;

public class P02 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        for(int i=0;i<100;i++)
            list.add(i+1);

        System.out.println(list);
    }
}
