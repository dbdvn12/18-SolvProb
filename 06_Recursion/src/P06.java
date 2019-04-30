public class P06 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 8};
        System.out.println(sum(arr, arr.length - 1));
    }

    private static long sum(int[] arr, int i) {
        if (i == 0) return arr[0];
        return arr[i] + sum(arr, i - 1);
    }
}
