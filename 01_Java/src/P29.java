import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class P29 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] in=br.readLine().split(" ");
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i=0;i<in.length;i++)
            arr.add(Integer.parseInt(in[i]));
        int k=Integer.parseInt(br.readLine());
        for(int i=0;i<k;i++) {
            arr.addFirst(arr.removeLast());
        }
        System.out.println(arr);
    }
}
