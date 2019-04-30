import java.util.Arrays;

public class P23_E {
    public static void main(String[] args) {
        int v[]=new int[2];
        bitString(v, 0);
    }
    private static void bitString(int[] v, int i) {
        if(i==v.length){
            System.out.println(Arrays.toString(v));
            return;
        }
        v[i]=0;
        bitString(v, i+1);
        v[i]=1;
        bitString(v, i+1);
        v[i]=2;
        bitString(v, i+1);
        v[i]=3;
        bitString(v, i+1);
        v[i]=4;
        bitString(v, i+1);
        v[i]=5;
        bitString(v, i+1);
        v[i]=6;
        bitString(v, i+1);
        v[i]=7;
        bitString(v, i+1);
    }
}