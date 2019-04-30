import java.util.Arrays;

public class P19_A {
    public static void main(String[] args) {
        int price[] = {100, 90, 80, 70, 85, 95, 110, 120};
        int span[] = new int[price.length];
        for (int i = 0; i < price.length; i++) {
            int count=1;
            for (int j = i-1; j >=0; j--) {
                if(price[i]>=price[j])
                    count++;
                else break;
            }
            span[i]=count;
        }
        System.out.println(Arrays.toString(span));
    }
}