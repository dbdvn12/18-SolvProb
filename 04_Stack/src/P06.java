import java.util.Stack;

public class P06 {
    public static void main(String[] args) {
        String s = "부산({Busan}[(Boo)(saan)])시청({City}{hall}[(See)(Cheong)])"; // true
        System.out.println(checkParen(s));
    }

    private static boolean checkParen(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
//            else if((c==')'||c=='}'||c==']')&&!stack.isEmpty()) {
//                if(stack.peek()=='('||c==')')
//                    stack.pop();
//                else if(stack.peek()=='{'||c=='}')
//                    stack.pop();
//                else if(stack.peek()=='['||c==']')
//                    stack.pop();
//            }
//            else if((c==')'||c=='}'||c==']')&&stack.isEmpty())
//                return false;
            if (c == ')')
                if (stack.isEmpty() || stack.pop() != '(')
                    return false;
            if (c == '}')
                if (stack.isEmpty() || stack.pop() != '{')
                    return false;
            if (c == ']')
                if (stack.isEmpty() || stack.pop() != '[')
                    return false;

        }
        if (stack.isEmpty())
            return true;
        return false;
    }
}
