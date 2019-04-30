import java.util.Arrays;

public class P10 {
    public static void main(String[] args) {
        int n[]={3,4,5,6,7,0,0,0,0,0};
        for (int i = 1; i <n.length ; i++) {
            n[i-1]=n[i];
        }
        System.out.println(Arrays.toString(n));
    }
}
