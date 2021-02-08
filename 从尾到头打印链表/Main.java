import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;
        head.next = listNode2;
        System.out.println(func(head));
    }

    private static int[] func(ListNode head) {
        if (head == null)
            return new int[0];

        ArrayDeque<Integer> arrayDeque = new ArrayDeque();
        do {
            arrayDeque.addFirst(head.val);
            head = head.next;
        } while (head != null);

        int[] r = new int[arrayDeque.size()];
        for (int i = 0, size = arrayDeque.size(); i < size; i++)
            r[i] = arrayDeque.pollFirst();
        return r;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
