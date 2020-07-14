public class Main {

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(5);
        l3.next = l4;
        l2.next = l3;
        l1.next = l2;
        l.next = l1;

        func(l);
    }

    private static ListNode func(ListNode head) {
        if (head == null) return null;

        ListNode point = new ListNode(0);
        reverse(head, point);
        return point.next;
    }

    private static ListNode reverse(ListNode listNode, ListNode point) {
        ListNode val = new ListNode(listNode.val);
        ListNode tmp;
        // 一旦递归到链表末尾, 就开始回溯构造链表
        if (listNode.next != null)
            tmp = reverse(listNode.next, point);
        else
            tmp = point;
        tmp.next = val;
        return tmp.next;
    }

}

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
    
}
