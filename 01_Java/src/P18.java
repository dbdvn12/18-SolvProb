import java.util.Arrays;

public class P18 {
    public static void main(String[] args) {
        int n[]={5,7,9,1,3,5,8,2,4,9};
        Arrays.sort(n);
        int temp=0;
        for (int i=0 ;i<=n.length/2 ;i++ ) {
            temp=n[i];
            n[i]=n[n.length-1-i];
            n[n.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(n));
    }
}