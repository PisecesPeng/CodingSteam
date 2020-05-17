import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(func(s, t));
    }

    private static boolean func(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.equals(t)) return true;

        Map<String, Integer> sMap = new HashMap<>();
        Map<String, Integer> tMap = new HashMap<>();
        int sLen, tLen;
        int length = (sLen = s.length()) > (tLen = t.length()) ? s.length() : t.length();
        // 将 k:字母 v:出现次数 存到map中
        for (int i = 0; i < length; i++) {
            if (i < sLen)
                sMap.merge(String.valueOf(s.charAt(i)), 1, (oldVal, newVal) -> oldVal + newVal);
            if (i < tLen)
                tMap.merge(String.valueOf(t.charAt(i)), 1, (oldVal, newVal) -> oldVal + newVal);
        }
        if (sMap.size() != tMap.size()) return false;
        for (Map.Entry<String, Integer> entry : sMap.entrySet()) {
            Integer tValue;
            // 判断map中是否存在指定字母, 且出现次数是否相同
            if (Objects.isNull(tValue = tMap.get(entry.getKey()))
                    || !tValue.equals(entry.getValue())) {
                return false;
            }
        }
        return true;
    }

}
