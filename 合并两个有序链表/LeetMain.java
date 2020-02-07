public class LeetMain {

    public static void main(String[] args) {
        // 有序链表
        ListNode node1 = new ListNode(1);
        ListNode na = new ListNode(2);
        na.next = new ListNode(4);
        node1.next = na;
        // 有序链表
        ListNode node2 = new ListNode(1);
        ListNode nb = new ListNode(3);
        nb.next = new ListNode(4);
        node2.next = nb;

        System.out.println(func(node1, node2));
    }

    private static ListNode func(ListNode node1, ListNode node2) {
        ListNode prehead = new ListNode(-1);  // 初始化结果链表
        ListNode prev = prehead;  // 初始化临时链表
        while (node1 != null && node2 != null) {
            // 比较两链表间的大小, 将较小的设置为临时链表的next, 较小链表向next移动
            if (node1.val <= node2.val) {
                prev.next = node1;
                node1 = node1.next;
            } else {
                prev.next = node2;
                node2 = node2.next;
            }
            // prev向next移动
            prev = prev.next;
        }
        // 将未循环完的node全部设置为prev的next
        prev.next = node1 == null ? node2 : node1;

        return prehead.next;
    }

    public static class ListNode {
        int val;  // 当前链表值
        ListNode next;  // 下一个链表对象
        ListNode(int x) {  //赋值链表的值
            val = x;
        }
    }

}

