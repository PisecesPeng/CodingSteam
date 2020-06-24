public class LeetMain {

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
        ListNode listNode = func(l, 2);
        System.out.println(listNode);
    }

    private static ListNode func(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // 前进第一个指针, 以便第一个指针和第二个指针之间的间隙相隔n个节点
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // 移动第一个指针到最后, 期间保持两指针中的间隙
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
