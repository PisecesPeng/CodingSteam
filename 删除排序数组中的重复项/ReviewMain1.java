import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ReviewMain1 {

    public static void main(String[] args) {
        int[] ints = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5};
        int count = func(ints);
        System.out.println(count);

        for (int i = 0; i < count; i++) {
            System.out.print(ints[i] + " ");
        }
    }

    private static int func(int[] ints) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0,rIndex = 0; i < ints.length; i++) {
            String key = String.valueOf(ints[i]);
            // 若是map不存在的值, 则put, 且将累加的index设置为value
            if (Objects.isNull(map.get(key))) map.put(key, rIndex++);
        }
        // 将map中的值, 重新赋值到数组中
        map.forEach((k, v) -> ints[v] = Integer.valueOf(k));
        return map.size();
    }
    
}
