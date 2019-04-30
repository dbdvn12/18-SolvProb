import java.util.Arrays;

public class BS03_A {
    public static void main(String[] args) {
        int v[] = {1,1,1,1,2,2,2, 3,4,5, 6, 8, 9};
        Arrays.sort(v); // 배열 정렬
        int key = 6;
        int index = binarySearch(v, key, 0, v.length - 1); // 정렬된 배열 내 자료 위치 이진 탐색
        if (index < 0) System.out.println("배열 내 자료 없음");
        else System.out.println("자료 발견 위치(배열 내 index): " + index);
    }

    private static int binarySearch(int[] v, int key, int left, int right) {
        int m=(int)((long)left+right)/2;
        if(left>right) return -1;
        if(key==v[m]) return m;
        if(key>v[m]) return binarySearch(v,key,m+1,right);
        else return binarySearch(v,key,left,m-1);
    }
}
