import java.util.Arrays;

public class P17 {
    public static void main(String[] args) {
        String v[] = {"Korea", "UK", "China", "United States", "Canada", "Brazil"};
        countingSort(v, 20); // 문자열 최대 길이를 20으로 가정
        System.out.println(Arrays.toString(v));
    }

    private static void countingSort(String[] n, int max) {
        String[] a = new String[n.length];
        int[] count = new int[max + 1];
        for (int i = 0; i < a.length; i++)
            count[n[i].length()]++;
        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];
        for (int i = a.length - 1; i >= 0; i--)
            a[--count[n[i].length()]] = n[i];
        for (int i = 0; i < a.length; i++)
            n[i] = a[i];
    }
}