import java.util.Arrays;

public class P06 {
    public static void main(String[] args) {
        int v[]=new int[]{8,5,9,1,5,3,5,1};
        mergeSort(v, 0, v.length-1);
        System.out.println(Arrays.toString(v));
    }
    private static void mergeSort(int[] v, int left, int right) {
        if(left==right) return;
        int m=(left+right)/2;
        mergeSort(v, left, m);
        mergeSort(v, m+1, right);
        mergeArray(v, left, m, m+1, right);
    }
    private static void mergeArray(int[] v, int left1, int right1, int left2, int right2) {
        int[] arr = new int[right2-left1+1];
        int ni=left1,mi=left2, k=0;
        while(ni<=right1&&mi<=right2)
            arr[k++] = (v[ni] > v[mi]) ? v[mi++] : v[ni++];
        while(ni<=right1) arr[k++]=v[ni++];
        while(mi<=right2) arr[k++]=v[mi++];
//        System.arraycopy(arr,0,v,left1,arr.length);
        for (int i = 0; i < arr.length; i++) {
            v[i+left1]=arr[i];
        }
    }
}