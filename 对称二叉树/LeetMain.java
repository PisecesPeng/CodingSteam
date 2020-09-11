import java.util.LinkedList;
import java.util.Queue;

public class LeetMain {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        TreeNode left1 = new TreeNode(3);
        TreeNode left2 = new TreeNode(4);
        TreeNode right1 = new TreeNode(4);
        TreeNode right2 = new TreeNode(3);
        left.left = left1;
        left.right = left2;
        right.left = right1;
        right.right = right2;
        node.left = left;
        node.right = right;
        System.out.println(func(node));
    }

    public static boolean func(TreeNode root) {
        return check(root, root);
    }
    
    // 迭代
    public static boolean check(TreeNode u, TreeNode v) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(u);
        q.offer(v);
        while (!q.isEmpty()) {
            u = q.poll();
            v = q.poll();
            if (u == null && v == null) {
                continue;
            }
            // 存在不一致的值, 直接返回false
            if ((u == null || v == null) || (u.val != v.val)) {
                return false;
            }
            // 将余下子结点, 按左右对称入队
            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);
        }
        // 未出现不一致, 则为对称二叉树
        return true;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}