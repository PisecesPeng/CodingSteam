import java.util.Stack;

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
        System.out.println(func1(node));
        System.out.println(func2(node));
    }

    /** 1. 递归 */
    public static boolean func1(TreeNode root) {
        return isValid(root, null, null);
    }

    public static boolean isValid(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;

        int val = node.val;
        // 判断是否存在不符合条件结点
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;
        // 根据左右结点不同, 更新lower&uppper的值(更新'符合条件的区间')
        if (!isValid(node.right, val, upper)) return false;
        if (!isValid(node.left, lower, val)) return false;
        return true;
    }

    /** 2. 中序遍历 */
    public static boolean func2(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        double inorder = - Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            // 中序遍历, 每次取得最左边的结点
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            // 如果中序遍历得到的节点的值小于等于前一个inorder，说明不是二叉搜索树
            if (root.val <= inorder) return false;
            inorder = root.val;
            root = root.right;
        }
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