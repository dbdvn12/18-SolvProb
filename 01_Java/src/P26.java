import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P26 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] in=br.readLine().split(" ");
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<in.length;i++)
            arr.add(Integer.parseInt(in[i]));
        Collections.sort(arr);
        for(int i=arr.size()-1;i>=1;i--) {
            if(arr.get(i).equals(arr.get(i-1)))
                arr.remove(i);
        }
        System.out.println(arr);
    }
}
