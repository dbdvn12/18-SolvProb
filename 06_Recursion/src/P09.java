public class P09 {
    public static void main(String[] args) {
        int n[] = {5, 1, 8, 3, 2};
        System.out.println(max(n, 0, n.length - 1));
    }

    private static int max(int[] n, int low, int high) {
        int m, right, left;
        m = (low + high) / 2;
        if (low == high) return n[low];
        left = max(n, low, m);
        right = max(n, m + 1, high);
        return (left > right) ? left : right;
    }
}