import java.util.LinkedList;

public class Test03 {
    public static void main(String[] args) {
        long start;
        int N=10000; // 자료 개수
        int s[]=new int[N]; // 배열 생성
        LinkedList<Integer> list=new LinkedList<>(); // 리스트 생성
        start=System.currentTimeMillis();
        for (int i=0; i < N; i++){
            for (int j = i-1; j >=0; j--) s[j+1]=s[j]; // 배열 자료 전체 오른쪽 한칸 이동
            s[0]=i; // 배열 0번째 위치에 자료 삽입
        }
        System.out.println((System.currentTimeMillis()-start)+" ms");
        start=System.currentTimeMillis();
        for (int i=0; i < N; i++) list.addFirst(i); // 연결리스트 0번째 위치에 자료 삽입
        System.out.println((System.currentTimeMillis()-start)+" ms");
    }
}
