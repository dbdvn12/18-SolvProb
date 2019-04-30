import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P25 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] in=br.readLine().split(" ");
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<in.length;i++)
            arr.add(Integer.parseInt(in[i]));
        Collections.sort(arr);
        if(arr.size()%2==1)
            System.out.println(arr.get(arr.size()/2));
        else {
            double median=(arr.get(arr.size()/2)+arr.get(arr.size()/2-1))/2.0;
            System.out.println(median);
        }
    }
}
