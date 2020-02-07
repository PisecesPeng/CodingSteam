import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 有序链表
        List<Integer> list1 = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(4);
        }};
        List<Integer> list2 = new ArrayList<Integer>() {{
            add(1);
            add(3);
            add(4);
        }};

        System.out.println(func(list1, list2));
    }

    private static List<Integer> func(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);  // 将链表先合并
        int maxSize = list1.size();  // 链表大小
        // 冒泡排序
        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize - i; j++) {
                if ((j + 1) >= maxSize) break;
                if (list1.get(j) > (list1.get(j + 1))) {
                    int swap = list1.get(j);
                    list1.set(j, list1.get(j + 1));
                    list1.set(j + 1, swap);
                }
            }
        }
        return list1;
    }

}
