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

        func(l);
    }

    private static ListNode func(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        // 每次循环都将指针指向反转
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

}

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
    
}
