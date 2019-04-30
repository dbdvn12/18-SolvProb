import java.util.Arrays;

public class P09 {
    public static void main(String[] args) {
        String v[]={"Korea", "UK", "China", "United States", "Canada", "Brazil"};
        bubbleSort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void bubbleSort(String v[]) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 1; j < v.length; j++) {
                if(v[j-1].length()>v[j].length()) {
                    String temp=v[j];
                    v[j]=v[j-1];
                    v[j-1]=temp;
                }
            }
        }
    }
}