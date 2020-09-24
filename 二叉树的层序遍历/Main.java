import java.util.ArrayList;
import java.util.List;

public class Main {

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
       List<TreeNode> tmpList = new ArrayList<>();
       if (null != root) tmpList.add(root);

       List<List<Integer>> x = new ArrayList<>();  // 存放结果
       while (tmpList.size() > 0) {
           // 将本层的节点复制到新list中, 并将老list清空
           List<TreeNode> tmp = new ArrayList();
           tmp.addAll(tmpList);
           tmpList.clear();
           List<Integer> y = new ArrayList<>();
           for (TreeNode node : tmp) {
               // 将本层的值统计
               y.add(node.val);
               // 将本层的节点按顺序添加, 为下一次循环
               if (null != node.left)
                   tmpList.add(node.left);
               if (null != node.right)
                   tmpList.add(node.right);
           }
           x.add(y);
       }
       return x;
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