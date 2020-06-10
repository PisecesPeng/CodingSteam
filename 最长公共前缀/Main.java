package com.pipe.codingsteam.最长公共前缀;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // 字符串数组
        String[] strArray = new String[]{"flower", "flow", "flight"};
        System.out.println(func(strArray));
    }

    private static String func(String[] strArray) {
        if (null == strs || strs.length < 1) return "";
        int result = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            int length = Math.min(result, strs[i].length());
            // 根据最小长度截取, 直接判断是否与之前前缀一致
            if (strs[0].substring(0, result).equals(strs[i].substring(0, length))) continue;
            int tmp = 0;
            for (int j = 0; j < length; j++) {
                if (strs[0].charAt(j) == strs[i].charAt(j)) tmp++;
                else break;
            }
            result = tmp;
            if (result == 0) return "";
        }
        return strs[0].substring(0, result);
    }

}
