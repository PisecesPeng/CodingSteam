package com.pipe.codingsteam.回文数;

public class LeetMain {

    public static void main(String[] args) {
        // 整数
        int num = 1567651;

        System.out.println(func(num));
    }

    private static boolean func(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) return Boolean.FALSE;  // 简单判断是否不符 回文数 要求
        int revertNum = 0;  // 对折后的整数
        while (num > revertNum) {
            // 将整数的后几位 取余拿出并构建一个新整数
            revertNum = revertNum * 10 + num % 10;
            num /= 10;
        }
        return num == revertNum || num == revertNum / 10;  // 可能存在整数位数 单/双, 均可
    }

}
