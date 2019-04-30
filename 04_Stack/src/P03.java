import java.util.Stack;

public class P03 {
    public static void main(String[] args) {
        String s="대한민국의 수도는 서울이다.";
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            stack.push(c);
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
    }
}
