import java.util.Stack;

public class P05 {
    public static void main(String[] args) {
        String s = ")1+3*(4+5))/(6*(7+8)(";
        System.out.println(checkParen(s));
    }

    private static boolean checkParen(String s) {
        Stack<Character> stack = new Stack<>();
        try {
            for (Character c : s.toCharArray()) {
                if(c=='(')
                    stack.push(c);
                if(c==')')
                    stack.pop();
            }
        } catch (Exception c) {
            return false;
        }
        if (stack.isEmpty()) {
            return true;
        } else
            return false;
    }
}
