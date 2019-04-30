import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P22 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int[] arr = new int[in.length];
        for (int i = 0; i < in.length; i ++)
            arr[i] = Integer.parseInt(in[i]);
        int max = 0;
        int maxnd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==max)
                arr[i]=0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxnd) {
                maxnd=arr[i];
            }
        }
        System.out.println(maxnd);
    }
}
