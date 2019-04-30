import java.util.Arrays;

public class SimpleQueue {
    int rear=-1, front=-1, MaxSize=5;
    char queue[];
    public SimpleQueue() {
        queue=new char[MaxSize];
    }
    public void add(char data) {
        if(full()) {
            throw new RuntimeException("queue full");
        }
        queue[++rear]=data;
    }
    public int remove() {
        if(empty()) throw new RuntimeException("queue empty");
        return queue[++front];
    }
    private boolean full() { return rear==MaxSize-1; }
    private boolean empty() { return rear==front; }
    @Override
    public String toString() {
        return "front="+front+", rear="+rear+", "+ Arrays.toString(queue);
    }
}