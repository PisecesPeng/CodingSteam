import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        CQueue queue = new CQueue();
        System.out.println(queue.deleteHead());
        queue.appendTail(5);
        queue.appendTail(2);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }

}
class CQueue {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public CQueue() {
        first = new Stack();
        second = new Stack();
    }

    public void appendTail(int value) {
        first.push(value);
    }

    public int deleteHead() {
        if (second.empty())
            while (!first.empty())
                second.push(first.pop());
        int r = -1;
        if (!second.empty())
            r = second.pop();
        return r;
    }

}