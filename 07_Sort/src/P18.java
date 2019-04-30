import java.util.Random;

public class P18 {
    public static void main(String[] args) {
        Random random=new Random();
        int n=random.nextInt(Integer.MAX_VALUE);
        int pos=3; // 3 => 천의 자리 수 (10^3)
        int d= (n/1000)%10;
        System.out.println(n+" => "+d);
    }
}
