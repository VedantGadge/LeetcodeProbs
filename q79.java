public class q79{
     private static final int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

    public boolean find(char[][] board, int i, int j, int n, int m, String word, int idx) {
        if (idx == word.length()) return true;
        if (i < 0 || j < 0 || i >= n || j >= m || board[i][j] == '$' || board[i][j] != word.charAt(idx)) return false;
        char temp = board[i][j];
        board[i][j] = '$';
        for (int[] direction : directions) {
            int i_new = i + direction[0];
            int j_new = j + direction[1];
            if (find(board, i_new, j_new, n, m, word, idx + 1)) {
                board[i][j] = temp;
                return true;
            }
        }
        board[i][j] = temp;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0) && find(board, i, j, n, m, word, 0)) return true;
            }
        }
        return false;
    }
}