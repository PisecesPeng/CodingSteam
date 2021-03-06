import java.util.HashMap;

public class LeetMain {

    public static void main(String[] args) {
        // [[1,null],[2,0],[3,null]]
        Node node1 = new Node(1, null, null);
        Node node2 = new Node(2, null, null);
        Node node3 = new Node(3, null, null);
        node1.next = node2;
        node2.next = node3;
        node1.random = null;
        node2.random = node1;
        node3.random = null;
        func(node1);
    }

    static HashMap<Node, Node> visitedHash = new HashMap<Node, Node>();

    private static Node func(Node head) {
        if (head == null) {
            return null;
        }
        if (visitedHash.containsKey(head)) {
            return visitedHash.get(head);
        }
        Node node = new Node(head.val, null, null);
        visitedHash.put(head, node);
        node.next = func(head.next);
        node.random = func(head.random);
        return node;
    }
}

class Node {
    int val;
    Node next;
    Node random;
    public Node(int val, Node next, Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }
}