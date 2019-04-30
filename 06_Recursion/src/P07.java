public class P07 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 8};
        System.out.println(sum(arr, 0));
    }

    private static long sum(int[] arr, int i) {
        if (i == arr.length - 1)
            return arr[arr.length - 1];
        return arr[i] + sum(arr, i + 1);
    }
}
