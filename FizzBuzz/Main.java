package codingsteam.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        func(15);
    }

    private static List<String> func(int n) {
        List<String> list = new ArrayList<>(n);
        // 针对不密集的赋值, 避免每次循环无效计算, 直接跳表的方式遍历更快
        for (int i = 1; i <= n; i++)
            list.add(String.valueOf(i));
        for (int i = 2; i < n; i += 3)
            list.set(i, "Fizz");
        for (int i = 4; i < n; i += 5)
            list.set(i, "Buzz");
        for (int i = 14; i < n; i += 15)
            list.set(i, "FizzBuzz");
        return list;
    }

}
