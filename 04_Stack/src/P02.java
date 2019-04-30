import java.util.Stack;

public class P02 {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("월");
        stack.push("화");
        stack.push("수");
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        String v=stack.peek();
        System.out.println(v);
        v=stack.pop();
        System.out.println(v);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
    }
}
