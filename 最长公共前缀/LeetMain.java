package com.pipe.codingsteam.最长公共前缀;

public class LeetMain {

    public static void main(String[] args) {
        // 字符串数组
        String[] strArray = new String[]{"flower", "flow", "flight"};

        System.out.println(func(strArray));
    }

    private static String func(String[] strArray) {
        // 判断字符串数组是否为空
        if (strArray.length == 0)
            return "";

        String ans = strArray[0];  // 将第一个字符串设置公共前缀默认值
        // 从第二个字符串开始循环, 每次循环将与自己的下一个字符串 两两比较获得其公共前缀
        for (int i = 1; i < strArray.length; i++) {
            int j = 0;
            for (; j < ans.length() && j < strArray[i].length(); j++) {
                // 询价比较两字符串的每个字符, 若出现不同则跳出比较
                if (ans.charAt(j) != strArray[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);  // 根据 字符串截取下标 更新公共前缀
            if (ans.equals(""))
                return ans;
        }
        return ans;
    }
}

