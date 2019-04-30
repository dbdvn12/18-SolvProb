import java.util.LinkedList;

public class P04_A {
    public static void main(String[] args) {
        System.out.println(solveJosephusProblem(7, 3));
    }

    private static int solveJosephusProblem(int n, int k) {
        LinkedList<Integer> prisoners = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            prisoners.addLast(i+1);
        }
        while(prisoners.size()>1) {
            for(int i=0;i<k-1;i++)
                prisoners.add(prisoners.removeFirst());
            prisoners.removeFirst();
        }
        return prisoners.get(0);
    }
}