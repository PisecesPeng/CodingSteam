import java.time.Instant;

public class Main {

   public static void main(String[] args) {
       Solution solution = new Solution(new int[]{1, 2, 3});
       solution.shuffle();    // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。例如，返回 [3, 1, 2]
       solution.reset();      // 重设数组到它的初始状态 [1, 2, 3] 。返回 [1, 2, 3]
       solution.shuffle();    // 随机返回数组 [1, 2, 3] 打乱后的结果。例如，返回 [1, 3, 2]
   }

}

class Solution {

   private static int[] baseArray = null;
   private static int[] opsArray = null;

   public Solution(int[] nums) {
       baseArray = nums.clone();
       opsArray = nums;
   }

   /**
    * Resets the array to its original configuration and return it.
    */
   public int[] reset() {
       return baseArray;
   }

   /**
    * Returns a random shuffling of the array.
    */
   public int[] shuffle() {
       long length = opsArray.length;
       for (int i = 0; i < length; i++) {
           // 两两交换
           long idx1 = (Instant.now().getEpochSecond() >> 1) % length;
           int swap = opsArray[(int) idx1];
           long idx2 = (Instant.now().getEpochSecond() << 1 ) % length;
           opsArray[(int) idx1] = opsArray[(int) idx2];
           opsArray[(int) idx2] = swap;
       }
       return opsArray;
   }

}