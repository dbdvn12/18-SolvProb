public class P14 {
    public static void main(String[] args) {
        SimpleStack stack=new SimpleStack(10); // 크기 10의 Stack 생성
// 스택에 5 9 1 순차 삽입
        stack.push(5);
        stack.push(9);
        stack.push(1);
        System.out.println(stack); // 스택 출력
        int data=stack.pop(); // 스택에서 자료 추출
        System.out.println("Data deleted from stack:"+data);
        System.out.println(stack); // 스택 출력
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.peek());
    }
}