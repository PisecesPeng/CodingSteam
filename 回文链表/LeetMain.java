import java.util.ArrayList;
import java.util.List;

public class LeetMain {

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
        List<Integer> vals = new ArrayList<>();

        // Convert LinkedList into ArrayList.
        ListNode currentNode = node;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        // Use two-pointer technique to check for palindrome.
        int front = 0;
        int back = vals.size() - 1;
        while (front < back) {
            // Note that we must use ! .equals instead of !=
            // because we are comparing Integer, not int.
            if (!vals.get(front).equals(vals.get(back))) {
                return false;
            }
            front++;
            back--;
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

