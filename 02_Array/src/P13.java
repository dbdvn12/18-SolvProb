import java.util.Arrays;

public class P13 {
    public static void main(String[] args) {
        char s[]= {'화','수','목','금','토','일'};
        System.out.println(Arrays.toString(s));
        char t[]=new char[s.length+1];
//        System.arraycopy(s, 0, t, 1, s.length);
        for(int i=s.length-1;i>=0;i--) {
            t[i+1]=s[i];
        }
        t[0]='월';
        s=t;
        System.out.println(Arrays.toString(s));

    }
}
