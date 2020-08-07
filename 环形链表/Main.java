public class Main {

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
        ListNode p1 = node, p2 = node;
        while (p2 != null) {
            // 指针1 前进一位
            if ((p1 = p1.next) == null)
                return false;
            // 指针2 前进两位
            if ((p2 = p2.next) == null)
                return false;
            else
                p2 = p2.next;
            // 判断是否为环形链表
            if (p1 == p2) return true;
        }
        return false;
    }

    public static class ListNode {
        int val;  // 当前链表值
        ListNode next;  // 下一个链表对象

        ListNode(int x) {  //赋值链表的值
            val = x;
        }
    }
}
