package com.pipe.codingsteam.回文数;

public class Main {

    public static void main(String[] args) {
        // 整数
        int num = 1567651;

        System.out.println(func(num));
    }

    private static boolean func(int num) {
        // 若整数为0, 则是回文数
        if (num == 0) return Boolean.TRUE;
        // 若整数为负数, 则不可能是回文数
        if (num < 0) return Boolean.FALSE;
        // 若整数最后一位为0, 则不可能是回文数
        if (num % 10 == 0) return Boolean.FALSE;

        int size = 0;
        int tmp = num;
        while (tmp > 0) {
            tmp /= 10;
            size++;
        }
        int[] nums = new int[size];  // 建立整数的数组

        int index = 0;
        while (num > 0) {  // 装载整数
            nums[index] = num % 10;
            num /= 10;
            index++;
        }

        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            if (i >= j) return Boolean.TRUE;
            if (nums[i] != nums[j]) return Boolean.FALSE;
        }

        return Boolean.FALSE;
    }

}
