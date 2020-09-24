import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetMain {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(6);
        TreeNode right1 = new TreeNode(3);
        TreeNode right2 = new TreeNode(7);
        right.left = right1;
        right.right = right2;
        node.left = left;
        node.right = right;
        System.out.println(func(node));
    }

    public static List<List<Integer>> func(TreeNode root) {
        // 存放结果
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                // 取出本层节点的值
                TreeNode node = queue.poll();
                level.add(node.val);
                // 设置本层节点的值(下一次循环)
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ret.add(level);
        }

        return ret;
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