import java.util.Objects;

public class Main {

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
    }

    private static ListNode func(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        boolean isCarry = false;  // 进位标识
        // 判断是否存在listNode, 并开始循环
        boolean l1IsNull = Objects.nonNull(l1), l2IsNull = Objects.nonNull(l2);
        while (l1IsNull || l2IsNull) {
            int tmpVal = 0;
            // 判断listNode是否还存在
            if (l1IsNull) {
                tmpVal += l1.val;
                l1IsNull = Objects.nonNull(l1 = l1.next);
            }
            if (l2IsNull) {
                tmpVal += l2.val;
                l2IsNull = Objects.nonNull(l2 = l2.next);
            }
            // 判断是否需要进位
            if (isCarry) {
                tmpVal += 1;
                isCarry = false;
            }
            // 判断本次循环之和是否需要进位
            if (tmpVal / 10 > 0) isCarry = true;
            // 获得最后一个listNode, 然后在其.next添加新listNode
            lastNode(result).next = new ListNode(tmpVal % 10);
        }
        // 判断是否还存在进位
        if (isCarry) lastNode(result).next = new ListNode(1);
        return result.next;
    }

    // 找出最后一个ListNode
    private static ListNode lastNode(ListNode listNode) {
        if (Objects.isNull(listNode.next)) {
            return listNode;
        } else {
            return lastNode(listNode.next);
        }
    }

}

class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

}