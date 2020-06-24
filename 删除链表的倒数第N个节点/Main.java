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
       ListNode listNode = func(l, 2);
       System.out.println(listNode);
   }

   private static ListNode func(ListNode head, int n) {
       ListNode newHead = new ListNode(0);
       newHead.next = head;
       // 双指针法
       ListNode head1 = newHead;
       ListNode head2 = newHead;
       // head1 提前先走n步
       while ((n--) > 0) {
           head1 = head1.next;
       }
       // head1到链表最后, head1、head2之间间隔n
       while (head1.next != null) {
           head1 = head1.next;
           head2 = head2.next;
       }

       if (head1 != head2)
           head2.next = head2.next.next;

       return newHead.next;
   }

}

class ListNode {
   int val;
   ListNode next;

   ListNode(int x) {
       val = x;
   }
}
