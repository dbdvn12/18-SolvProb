import java.util.LinkedList;

public class P01 {
    public static void main(String[] args) {    //넣고 빠지는 순서가 다르지만 결과적으로 같다
        LinkedList<Integer> stack=new LinkedList<>();
        stack.addLast(1);
        stack.addLast(2);
        stack.addLast(3);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        int v=stack.getLast();
        System.out.println(v);
        v=stack.removeLast();
        System.out.println(v);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
    }
}
