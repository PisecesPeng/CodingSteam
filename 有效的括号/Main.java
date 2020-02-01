import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // 括号字符串
        String str = "([]){}";

        System.out.println(func(str));
    }

    private static Boolean func(String str) {
        // 空字符串可被认可为有效字符串
        if (null == str || "".equals(str)) return Boolean.TRUE;
        // 若字符串为单数, 则认为是无效字符串
        if (Objects.equals(1, str.length() % 2)) return Boolean.FALSE;

        // 初始化 栈
        Stack stack = new Stack();

        for (int i = 0; i < str.length(); i++) {
            // 如果栈的深度大于字符串剩余长度, 则可判定为无效字符串
            if (stack.getStackSize() > (str.length() - i)) return Boolean.FALSE;

            // 取出当次循环的括号
            String s = String.valueOf(str.charAt(i));

            if ("(".equals(s) || "[".equals(s) || "{".equals(s)) {
                // 若是符合条件, 则将该括号推入栈中
                stack.save(s);
            }
            // 判断该右括号是否存在匹配的左括号, 是则将左括号推出栈, 否则直接返回无效字符串
            else if (")".equals(s)) {
                if (stack.judgeStackValue("("))
                    stack.pop();
                else
                    return Boolean.FALSE;
            } else if ("]".equals(s)) {
                if (stack.judgeStackValue("["))
                    stack.pop();
                else
                    return Boolean.FALSE;
            } else if ("}".equals(s)) {
                if (stack.judgeStackValue("{"))
                    stack.pop();
                else
                    return Boolean.FALSE;
            }
            // 若 不存在上面的字符, 直接返回无效字符串
            else {
                return Boolean.FALSE;
            }
        }
        // 若循环结束, 栈中还存在数值则返回无效字符串
        if (Objects.equals(0, stack.getStackSize()))
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }

    // 存放栈的数组与下标
    static class Stack {
        private List<String> stack;
        private int index;

        // 初始化栈
        public Stack() {
            this.stack = new ArrayList<>();
            this.index = -1;
        }

        // 获得栈中的值数量
        public int getStackSize() {
            return this.stack.size();
        }

        // 获得栈最顶端的值
        public String getStackValue() {
            return this.stack.get(this.index);
        }

        // 将值推入栈
        public void save(String str) {
            this.stack.add(str);
            this.index++;
        }

        // 将值推出栈
        public void pop() {
            this.stack.remove(index);
            this.index--;
        }

        // 判断'栈最顶端的值'是否等于'参数'
        public boolean judgeStackValue(String str) {
            return this.getStackSize() > 0 && Objects.equals(str, this.getStackValue());
        }

    }
}
