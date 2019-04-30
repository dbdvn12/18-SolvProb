public class P02 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fact(n));
    }

    private static double fact(int n) {
        if(n==0) return 1;
        return n*fact(n-1);
    }
}
