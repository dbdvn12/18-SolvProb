import java.util.Arrays;

public class P04 {
    public static void main(String[] args) {
        int n[] = {1, 3, 5, 7, 8};
        int m[] = {2, 4, 6, 7, 10};
        int v[] = mergeArray(n, m);
        System.out.println(Arrays.toString(v));
    }

    private static int[] mergeArray(int[] n, int[] m) {
        int[] arr = new int[n.length + m.length];
        int ni = 0, mi = 0, k=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(mi==m.length) {
//                arr[i]=n[ni++];
//                continue;
//            }
//            if(ni==n.length) {
//                arr[i]=m[mi++];
//                continue;
//            }
//            arr[i] = (n[ni] > m[mi]) ? m[mi++] : n[ni++];
//        }

        while(ni<n.length&&mi<m.length)
            arr[k++] = (n[ni] > m[mi]) ? m[mi++] : n[ni++];
        while(ni<n.length) arr[k++]=n[ni++];
        while(mi<m.length) arr[k++]=m[mi++];
        return arr;
    }
}