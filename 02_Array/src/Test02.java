import java.util.LinkedList;

public class Test02 {
    public static void main(String[] args) {
        int N=10000; // 자료 개수
        int s[]=new int[N]; // 배열 생성
        for (int i=0; i < N; i++) s[i]=i; // 배열 내 자료 저장

        LinkedList<Integer> list=new LinkedList<>(); // 리스트 생성
        for (int i=0; i < N; i++) list.add(i); // 리스트 내 자료 삽입
        long start;
        start=System.currentTimeMillis();
        for (int i = 0; i < N; i++){ int v=s[i]; }
        System.out.println((System.currentTimeMillis()-start)+" ms");
        start=System.currentTimeMillis();
        for (int i = 0; i < N; i++){ int v=list.get(i); }
        System.out.println((System.currentTimeMillis()-start)+" ms");
    }
}
