public class LeetMain {

    public static void main(String[] args) {
        ListNode node = new ListNode(3);
        ListNode na = new ListNode(2);
        ListNode nb = new ListNode(0);
        ListNode nc = new ListNode(-4);
        nc.next = na;
        nb.next = nc;
        na.next = nb;
        node.next = na;

        System.out.println(func(node));
    }

    private static boolean func(ListNode node) {
        if (node == null || node.next == null) {
            return false;
        }
        // 快慢指针
        ListNode slow = node;
        ListNode fast = node.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static class ListNode {
        int val;  // 当前链表值
        ListNode next;  // 下一个链表对象

        ListNode(int x) {  //赋值链表的值
            val = x;
        }
    }

}

