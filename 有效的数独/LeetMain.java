public class LeetMain {

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
        int l = 9;
        //一遍扫描
        //memory boolean[][] rows index-row 标识对应的行数, index-col标识对应的数字 value 标识是否出现
        boolean[][] rows = new boolean[l][l];
        boolean[][] cols = new boolean[l][l];
        boolean[][] boxes = new boolean[l][l];

        for (int r = 0; r < l; r++) {
            for (int c = 0; c < l; c++) {
                if (board[r][c] != '.'){
                    int boxIndex = (r / 3) * 3 + c / 3;
                    int n = board[r][c]-'1';
                    if (rows[r][n]) { return false; }
                    if (cols[c][n]) { return false; }
                    if (boxes[boxIndex][n]) { return false; }
                    rows[r][n] = true;
                    cols[c][n] = true;
                    boxes[boxIndex][n] = true;
                }
            }
        }
        return true;
    }

}

