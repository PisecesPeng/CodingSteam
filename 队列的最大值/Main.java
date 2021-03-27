import java.util.ArrayDeque;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        MaxQueue maxQueue = new MaxQueue();
        maxQueue.push_back(1);
        maxQueue.push_back(2);
        System.out.println(maxQueue.max_value());
        System.out.println(maxQueue.pop_front());
        System.out.println(maxQueue.max_value());
    }

}

class MaxQueue {

    private static TreeMap<Integer, Integer> map = null;
    private static ArrayDeque<Integer> queue = null;

    public MaxQueue() {
        map = new TreeMap<>((i1, i2) -> -i1.compareTo(i2));
        queue = new ArrayDeque<>();
    }

    public int max_value() {
        Map.Entry<Integer, Integer> entry = map.firstEntry();
        if (entry == null) {
            return -1;
        } else {
            return entry.getKey();
        }
    }

    public void push_back(int value) {
        queue.addFirst(value);
        Integer vTmp;
        if ((vTmp = map.get(value)) == null) {
            map.put(value, 1);
        } else {
            map.put(value, vTmp + 1);
        }
    }

    public int pop_front() {
        Integer value = queue.pollLast();
        if (value == null) return -1;
        Integer vTmp = map.get(value);
        if (vTmp <= 1) {
            map.remove(value);
        } else {
            map.put(value, vTmp - 1);
        }
        return value;
    }
}
