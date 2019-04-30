import java.util.Arrays;
import java.util.Random;

public class Test04 {
    public static void main(String[] args)
    {
        long start;
        int N=10000000, M=100;
        int n[]=new int[N];
        Random random=new Random();
        for (int i = 0; i < N; i++) n[i]=random.nextInt(M);
        start=System.currentTimeMillis();
        Arrays.sort(n); // 배열 정렬
        System.out.println("최대값:"+n[n.length-1]); // 최대값 출력
        System.out.println("소요시간:"+(System.currentTimeMillis()-start)+" ms"); // 소요 시간 출력
        for (int i = 0; i < N; i++) n[i]=random.nextInt(M);
        start=System.currentTimeMillis();
        int max=n[0];
        for (int i = 1; i < n.length; i++) {
            if(n[i]>max) max=n[i];
        }
        System.out.println("최대값:"+max); // 최대값 출력
        System.out.println("소요시간:"+(System.currentTimeMillis()-start)+" ms"); // 소요 시간 출력
    }
}
