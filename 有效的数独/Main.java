import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        char[][] board = {
                {'.', '.', '.', '.', '.', '.', '.', '8', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '1', '.'},
                {'.', '4', '.', '.', '9', '.', '.', '.', '.'},
                {'.', '2', '.', '.', '.', '.', '.', '3', '.'},
                {'.', '8', '.', '.', '.', '.', '5', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '6', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '6', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '3', '.', '.', '.', '.'}
        };
        System.out.println(func(board));
    }

    private static boolean func(char[][] board) {
        Set<Integer> colSet = new HashSet<>();  // 判断 行 是否有重复
        Set<Integer> rowSet = new HashSet<>();  // 判断 列 是否有重复
        Set<Integer> cell = new HashSet<>();  // 判断 块 是否有重复
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c;
                if ((c = board[i][j]) != '.') {
                    // 当且仅当.add()返回false时, 则说明该数字已存在, 故直接返回false
                    if (!colSet.add((i + 1) * 10 + c))
                        return false;
                    if (!rowSet.add((j + 1) * 10 + c))
                        return false;
                    if (!cell.add(((i / 3) * 3 + j / 3 + 1) * 10 + c))
                        return false;
                }
            }
        }
        return true;
    }
}
