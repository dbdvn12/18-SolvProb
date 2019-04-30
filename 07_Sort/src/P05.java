import java.util.Arrays;

public class P05 {
    public static void main(String[] args) {
        int v[] = {1, 3, 5, 7, 8, 2, 4, 6, 7, 10};
        mergeArray(v, 0, 4, 5, 9); // v의 부분 배열들 v[0..4], v[5..9]이 정렬된 상태임
        System.out.println(Arrays.toString(v));
    }

    private static void mergeArray(int[] v, int left1, int right1, int left2, int right2) {
        int[] arr = new int[v.length];
        int ni=left1,mi=left2, k=0;
        while(ni<=right1&&mi<=right2)
            arr[k++] = (v[ni] > v[mi]) ? v[mi++] : v[ni++];
        while(ni<=right1) arr[k++]=v[ni++];
        while(mi<=right2) arr[k++]=v[mi++];
        for (int i = 0; i < arr.length; i++) {
            v[i+left1]=arr[i];
        }
//        for (int i = 0; i < arr.length; i++) {
//            if (left1 == right1 + 1) {
//                arr[i] = v[left2++];
//                continue;
//            }
//            if (left2 == right2 + 1) {
//                arr[i] = v[left1++];
//                continue;
//            }
//            arr[i] = (v[left2] > v[left1]) ? v[left1++] : v[left2++];
//        }
    }
}
