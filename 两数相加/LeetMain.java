public class LeetMain {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l1Next1 = new ListNode(4);
        ListNode l1Next2 = new ListNode(5);
        ListNode l1Next3 = new ListNode(9);
        l1Next2.next = l1Next3;
        l1Next1.next = l1Next2;
        l1.next = l1Next1;

        ListNode l2 = new ListNode(5);
        ListNode l2Next1 = new ListNode(6);
        ListNode l2Next2 = new ListNode(5);
        l2Next1.next = l2Next2;
        l2.next = l2Next1;

        func(l1, l2);
        System.out.println();
    }

    private static ListNode func(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;  // 指向当前listNode
        int carry = 0;  // 判断进位
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;  // 得到进位位数
            curr.next = new ListNode(sum % 10);  // 给定.next的listNode
            curr = curr.next;  // 将curr指向下一个listNode
            // 循环listNode
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {  // 判断是否还存在进位
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}

class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

}