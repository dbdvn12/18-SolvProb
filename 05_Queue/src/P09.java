public class P09 {
    public static void main(String[] args) {
        SimpleQueue queue=new SimpleQueue();
        System.out.println("크기 5 큐 초기 상태: "+queue);
        queue.add('A'); System.out.println("자료 A 삽입 후: "+queue);
        queue.add('B'); System.out.println("자료 B 삽입 후: "+queue);
        queue.add('C'); System.out.println("자료 C 삽입 후: "+queue);
        System.out.println("큐에서 자료 추출: "+(char)queue.remove());
        System.out.println("큐에서 자료 추출: "+(char)queue.remove());
        System.out.println("큐에서 자료 추출: "+(char)queue.remove());
        queue.add('D'); System.out.println("자료 D 삽입 후: "+queue);
        queue.add('E'); System.out.println("자료 E 삽입 후: "+queue);
    }
}