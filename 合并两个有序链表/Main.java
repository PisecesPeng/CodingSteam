public class Main {

    public static void main(String[] args) {
        // 有序链表
        ListNode node1 = new ListNode(1);
        ListNode na = new ListNode(2);
        na.next = new ListNode(4);
        node1.next = na;
        ListNode node2 = new ListNode(1);
        ListNode nb = new ListNode(3);
        nb.next = new ListNode(4);
        node2.next = nb;

        func(node1, node2);
    }

    private static ListNode func(ListNode node1, ListNode node2) {
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        // 循环两个链表, 直到其中一个到底
        while (node1 != null && node2 != null) {
            // 每次选择val最小的node, 作为返回的node
            if (node1.val > node2.val) {
                ListNode swap = node1;
                node1 = node2;
                node2 = swap;
            }
            tmp.next = node1;
            node1 = node1.next;
            tmp = tmp.next;
        }
        // 获得未到底的链表, 继续赋值
        tmp.next = node1 != null ? node1 : node2 ;
        return result.next;
    }

    public static class ListNode {
        int val;  // 当前链表值
        ListNode next;  // 下一个链表对象

        ListNode(int x) {  //赋值链表的值
            val = x;
        }
    }
}
