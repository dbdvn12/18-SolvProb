import java.util.LinkedList;

public class P04_B {
    public static void main(String[] args) {
        System.out.println(solveJosephusProblem(7,3));
    }
    private static int solveJosephusProblem(int n, int k) {
        LinkedList<Integer> prisoners=new LinkedList<>();
        int index=0;
        for(int i=0;i<n;i++)
            prisoners.add(i+1);
        while(prisoners.size()>1) {
            index=(index+k-1)%prisoners.size();
            prisoners.remove(index);
        }
        return prisoners.get(0);
    }
}