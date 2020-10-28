import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(func(43));
    }

    public static Map<Integer, Integer> map = new HashMap<>();

    private static int func(int n) {
        if (n == 0) return 1;  // 台阶剩余为0, 则台阶顺序正确
        if (n < 0) return 0;  // 台阶剩余小于0, 则台阶顺序不正确
        // 判定是否存在缓存的台阶结果
        if (map.containsKey(n))
            return map.get(n);
        int r = 0;
        // 计算上台阶方法次数, 并缓存
        map.putIfAbsent(n - 1, func(n - 1));
        map.putIfAbsent(n - 2, func(n - 2));
        // 累加每次上台阶方法次数
        r += map.get(n - 1) + map.get(n - 2);
        return r;
    }

}



