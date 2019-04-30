import java.util.Arrays;
import java.util.Stack;

public class P19_B {
    public static void main(String[] args) {
        int price[] = {100, 90, 80, 70, 85, 95, 110, 120};
        int span[] = new int[price.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 0; i < price.length; i++) {
            while (!st.empty() && price[i] >= price[st.peek()])
                st.pop();
//            if (st.empty())
//                span[i] = i + 1;
//            else span[i] = i - st.peek();
            span[i]=st.empty()?i+1:i-st.peek();
            st.push(i);
        }
        System.out.println(Arrays.toString(span));
    }
}
