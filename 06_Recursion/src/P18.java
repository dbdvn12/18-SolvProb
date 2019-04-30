public class P18 {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
    private static long fibo(int n) {
        if(n<2) return n;
        int tmp, cur=1, prev=0;
        for(int i=2;i<=n;i++) {
            tmp=cur;
            cur=prev+cur;
            prev=tmp;
        }
        return cur;
    }
}