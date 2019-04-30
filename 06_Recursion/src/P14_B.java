public class P14_B {
    public static void main(String[] args) {
        System.out.println(gcd(64, 48));
    }

    private static int gcd(int a, int b) {
        int tmp;
        while (b > 0) {
            tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}
