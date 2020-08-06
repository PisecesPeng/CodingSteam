public class Main {

   public static void main(String[] args) {
       ListNode node = new ListNode(1);
       ListNode na = new ListNode(2);
       ListNode nb = new ListNode(2);
       nb.next = new ListNode(1);
       na.next = nb;
       node.next = na;

       System.out.println(func(node));
   }

   private static boolean func(ListNode node) {
       // 链表只有一个node
       if (node == null || node.next == null)
           return true;
       // 链表只有两个node, 判断其值是否相同
       if (node.next.next == null)
           return node.val == node.next.val;

       ListNode idx1 = new ListNode(node.val);  // 回文前半段判断指针
       ListNode idx2 = node;  // 回文后半段判断指针
       ListNode idx3 = node;  // 回文中间位置判断指针
       while (idx3.next != null && idx3.next.next != null) {
           // 快慢指针, 将idx2位置定在链表中间
           idx2 = idx2.next;
           idx3 = idx3.next.next;
           // 构造前半段链表值
           ListNode tmp = new ListNode(idx2.val);
           tmp.next = idx1;
           idx1 = tmp;
       }
       // 补空
       if (idx3.next != null) idx2 = idx2.next;

       // 判断前后半段的值是否相同
       while (idx1 != null && idx2 != null) {
           if (idx1.val != idx2.val) return false;
           idx1 = idx1.next;
           idx2 = idx2.next;
       }
       // 当且仅当 两指针均在最后一位
       if (idx1 == null && idx2 == null)
           return true;
       else
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
