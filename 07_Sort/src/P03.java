import java.util.Arrays;

public class P03 {
    public static void main(String[] args) {
        int v[]=new int[]{5,8,1,9,3,5,1,5};
        insertionSort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void insertionSort(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int j = i;
            int x=v[i];
            for (; j>0 && x<v[j-1]; j--) {
                v[j]=v[j-1];
            }
            v[j]=x;
        }
    }
}