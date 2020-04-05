package com.pipe.codingsteam.最长公共前缀;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // 字符串数组
        String[] strArray = new String[]{"flower", "flow", "flight"};
        System.out.println(func(strArray));
    }

    private static String func(String[] strArray) {
        int maxStrArrLength = strArray.length;
        int maxIndex = maxStrArrLength - 1;  // 字符串数组的最大下标
        String comStr = "";  // 默认返回值
        if (Objects.equals(maxStrArrLength, 0)) return comStr;  // 若是字符串为空 则返回默认值
        if (Objects.equals(maxIndex, 0)) return strArray[0];   // 若是字符串数组仅有一个 则返回自身

        int minStrLeng = Integer.MAX_VALUE;  // 设置字符串数字中最短字符串的长度
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() < minStrLeng) minStrLeng = strArray[i].length();  // 求得最短字符串长度
        }

        int curSubIndex = 0;  // 默认截取前缀长短的下标
        while (true) {
            boolean hasCommon = true;  // 判断截取的字符串 在字符串数组中 是否为公共前缀
            for (int i = 0; i < maxIndex; i++) {
                int curIndex = i;  // 当前数组的下标
                // 比较两两字符串间的前缀是否相同
                if (!Objects.equals(
                        strArray[curIndex].substring(0, curSubIndex),
                        strArray[++curIndex].substring(0, curSubIndex))
                ) {
                    hasCommon = false;
                    break;
                }
            }
            // 若所有字符串的当前前缀均相同, 则赋值
            if (hasCommon) comStr = strArray[0].substring(0, curSubIndex);
            else return comStr;
            // 若是当前截取的前缀长度未超过最小字符串长度, 则继续
            if (curSubIndex < minStrLeng) curSubIndex++;
            else break;
        }
        return comStr;
    }

}
