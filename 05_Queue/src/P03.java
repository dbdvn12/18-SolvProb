import java.util.LinkedList;

public class P03 {
    public static void main(String[] args) {
        int n=7, k=4;
        LinkedList<Integer> queue=new LinkedList<>();
        for (int i=1; i <=n; i++) queue.add(i); // 1 2 3 4 5 6 7
        int curPos=0;
        System.out.println(queue.get(curPos+k-1)); // curPos부터 k번째 노드 값 => 4
        curPos=5;
        System.out.println(queue.get((curPos+k-1)%n)); // curPos부터 k번째 노드 값 => 2
    }
}