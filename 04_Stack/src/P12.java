import java.util.Arrays;

public class P12 {
    public static void main(String[] args) {
        int stack[] = new int[5]; // 크기 5의 스택 생성
        int top = -1;
// 스택에 5, 9, 1을 차례로 삽입(push)
        stack[++top] = 5;
        stack[++top] = 9;
        stack[++top] = 1;
        System.out.println(Arrays.toString(stack)+", top="+top+", 스택 크기="+(top+1));
        System.out.println("스택이 비어 있는가? "+(top==-1));
        System.out.println("스택 peek: "+stack[top]); // 스택 top 확인 peek
        System.out.println("스택 pop: "+stack[top--]); // 스택에서 자료 추출(pop)
        System.out.println(Arrays.toString(stack)+", top="+top+", 스택 크기="+(top+1));
        System.out.println("스택 pop: "+stack[top--]); // 스택에서 자료 추출(pop)
        System.out.println(Arrays.toString(stack)+", top="+top+", 스택 크기="+(top+1));
        System.out.println("스택 pop: "+stack[top--]); // 스택에서 자료 추출(pop)
        System.out.println(Arrays.toString(stack)+", top="+top+", 스택 크기="+(top+1));
        System.out.println("스택이 비어 있는가? "+(top==-1));
    }
}