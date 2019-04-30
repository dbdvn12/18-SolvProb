import java.util.LinkedList;

public class P01 {
    public static void main(String[] args) {
        LinkedList<String> queue=new LinkedList<>();
        queue.addFirst("한국"); // 큐 rear에 자료 삽입, queue.add("한국");
        queue.addFirst("미국"); // 큐 rear에 자료 삽입
        queue.addFirst("독일"); // 큐 rear에 자료 삽입
        System.out.println("큐 전체 내용: "+queue);
        System.out.println("큐 크기="+queue.size());
        System.out.println("큐가 비어 있는가? "+queue.isEmpty());
        String v=null;
        v=queue.getLast();
        System.out.println("큐 front 자료 확인="+v);
        v=queue.removeLast(); // String v=queue.remove();
        System.out.println("큐 front 추출 값="+v);
        System.out.println("큐 전체 내용: "+queue);
        System.out.println("큐 front 추출 값="+queue.removeLast());
        System.out.println("큐 전체 내용: "+queue);
        System.out.println("큐 front 추출 값="+queue.removeLast());
        System.out.println("큐 전체 내용: "+queue);
        System.out.println("큐가 비어 있는가? "+queue.isEmpty());
    }
}