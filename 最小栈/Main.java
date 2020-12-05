import java.util.*;

public class Main {

   public static void main(String[] args) {
       MinStack obj = new MinStack();
       obj.push(-2);
       obj.push(0);
       obj.push(-3);
       System.out.println(obj.getMin());
       obj.pop();
       System.out.println(obj.top());
       System.out.println(obj.getMin());
       System.out.println(obj);
   }

}

class MinStack {

   List<Node> list;  // 存储栈结构
   int idx = 0;  // 栈指针
   Node head;  // 按序存储值

   /**
    * initialize your data structure here.
    */
   public MinStack() {
       list = new ArrayList<>();
       head = new Node(Integer.MIN_VALUE);
   }

   public void push(int x) {
       list.add(idx++, addNode(new Node(x)));
   }

   public void pop() {
       removeNode(list.remove(--idx));
   }

   public int top() {
       return list.get(idx - 1).v;
   }

   public int getMin() {
       return head.next.v;
   }

   private Node addNode(Node x) {
       Node tmp = head;
       if (null == tmp.next) {
           head.next = x;
       } else {
           boolean flag = false;
           while (null != tmp.next) {
               Node next = tmp.next;
               if (next.v > x.v) {
                   tmp.next = x;
                   x.next = next;
                   flag = true;
                   break;
               } else {
                   tmp = next;
               }
           }
           if (flag == false) tmp.next = x;
       }
       return x;
   }

   private void removeNode(Node x) {
       Node tmp = head;
       while (null != tmp.next) {
           Node next = tmp.next;
           if (next.v == x.v) {
               tmp.next = next.next;
               break;
           } else {
               tmp = next;
           }
       }
   }

   private class Node {
       int v;
       Node next;

       public Node(int v) {
           this.v = v;
       }
   }

}