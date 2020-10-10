public class Main {

   public static void main(String[] args) {
       int[] nums = new int[]{-13, -9, -3, 1, 5, 13, 17};
       System.out.println(func(nums));
   }

   public static TreeNode func(int[] nums) {
       if (null == nums) return null;
       int length = nums.length, mid = length / 2;
       if (length < 1) return null;

       // 构建根(父)结点
       TreeNode treeNode = new TreeNode(nums[mid]);

       // 构建左子树
       int[] leftnums = new int[mid];
       // 复制出左边数组 单独构建二叉搜索树
       System.arraycopy(nums, 0, leftnums, 0, mid);
       if (leftnums.length > 1) {
           treeNode.left = func(leftnums);
       } else if (leftnums.length > 0) {
           treeNode.left = new TreeNode(leftnums[0]);
       }

       // 构建右子树
       int[] rightnums = new int[length - mid - 1];
       // 复制出右边数组 单独构建二叉搜索树
       System.arraycopy(nums, mid + 1, rightnums, 0, length - mid - 1);
       if (rightnums.length > 1) {
           treeNode.right = func(rightnums);
       } else if (rightnums.length > 0) {
           treeNode.right = new TreeNode(rightnums[0]);
       }

       return treeNode;
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
