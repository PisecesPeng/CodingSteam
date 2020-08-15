public class LeetMain {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        TreeNode right1 = new TreeNode(15);
        TreeNode right2 = new TreeNode(7);
        right.left = right1;
        right.right = right2;
        node.left = left;
        node.right = right;
        System.out.println(func(node));
    }

    private static int func(TreeNode root) {
        if(root == null) {
            return 0;
        } else {
            // 遍历
            int left = func(root.left);
            int right = func(root.right);
            return Math.max(left, right) + 1;
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