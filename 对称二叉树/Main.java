public class Main {

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
        if (null == root) return true;
        else return compare(root.left, root.right);
    }

    // 递归
    public static boolean compare(TreeNode left, TreeNode right) {
        // 左右结点均为空, 两结点相等且无子结点
        if (null == left && null == right) {
            return true;
        }
        else if (left != null && right != null) {
            // 判断当前两结点值是否相同, 并递归判断其各子结点
            return left.val == right.val
                    && compare(left.left, right.right)
                    && compare(left.right, right.left);
        }
        // 两结点仅有一结点有值
        else {
            return false;
        }
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