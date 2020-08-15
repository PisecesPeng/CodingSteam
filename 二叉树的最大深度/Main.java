public class Main {

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
       if (null == root) return 0;
       // 遍历
       return Math.max(func(root.left) + 1, func(root.right) + 1);
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