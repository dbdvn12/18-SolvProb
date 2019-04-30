import java.util.Arrays;
import java.util.LinkedList;

public class P20 {
    public static void main(String[] args) {
        int n[] = {432109876, 423, 312, 34, 43, 21, 223, 42};
        radixSort(n, 10, 9); // 최대 9자리까지 10진수 기수정렬
        System.out.println(Arrays.toString(n));
    }

    private static void radixSort(int[] n, int Radix, int Length) {
        LinkedList<Integer> queue[] = new LinkedList[Radix];
        for (int i = 0; i < queue.length; i++) queue[i] = new LinkedList<>();

        int pow = 1;
        for (int k = 0; k < Length; k++, pow *= 10) {
            for (int i = 0; i < n.length; i++)
                queue[(n[i] / pow) % Radix].add(n[i]);
            for (int i = 0, q = 0; q < queue.length; q++)
                while (!queue[q].isEmpty())
                    n[i++] = queue[q].remove();
        }
    }
}
