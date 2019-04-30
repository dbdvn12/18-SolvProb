import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P27 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] in=br.readLine().split(" ");
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<in.length;i++)
            arr.add(Integer.parseInt(in[i]));
        Collections.sort(arr);
        Collections.reverse(arr);
        ArrayList<Integer> order=new ArrayList<>();
        int ordernum=1;
        order.add(ordernum);
        for(int i=1; i<arr.size();i++) {
            if(arr.get(i).equals(arr.get(i-1)))
                order.add(ordernum);
            else
                order.add(++ordernum);
        }
        System.out.println(arr);
        System.out.println(order);
    }
}
