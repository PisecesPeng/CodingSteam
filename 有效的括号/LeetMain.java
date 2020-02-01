import java.util.HashMap;
import java.util.Stack;

public class LeetMain {

    public static void main(String[] args) {
        // 括号字符串
        String str = "([]){}";

        System.out.println(func(str));
    }

    private static Boolean func(String s) {
        // 初始化Map保存括号的映射关系
        HashMap<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put(']', '[');
        mappings.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 判断是否为右括号, 是则进行判断, 否则推入栈
            if (mappings.containsKey(c)) {
                // 若栈为空, 则给假定值'#'
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(c)) {  // 不符合映射关系, 直接返回无效字符串
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}

