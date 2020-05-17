package com.pipe.codingsteam.存在重复元素;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 1, 6};
        System.out.println(func(nums));
    }

    private static boolean func(int[] nums) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(String.valueOf(nums[i]));
            if (set.size() != (i + 1))
                return true;
        }
        return false;
    }

}
