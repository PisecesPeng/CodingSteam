public class LeetMain {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(func(s, t));
    }

    private static boolean func(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        // 将字母出现次数, 存放指定(ASCII差值)的下标处
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        // 减去出现次数, 是否出现不一致
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}
