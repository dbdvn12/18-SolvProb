import java.util.Arrays;

public class P14 {
    public static void main(String[] args) {
        int v[] = {87, 95, 53, 77, 100, 95, 14};
        sort(v);
        System.out.println(Arrays.toString(v));
    }

    private static void sort(int[] v) {
        int[] count = new int[101];
        for (int i = 0; i < v.length; i++) {
            count[v[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                for (int k = 0; k < count[i]; k++) {
                    v[j++] = i;
                }
            }
        }
    }
}