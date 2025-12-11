class Solution {

    static char[][] board;
    static boolean[][] visited;

    public boolean exist(char[][] b, String word) {
        board = b;
        int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    visited = new boolean[m][n];
                    if (dfs(i, j, word, 0)) return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int i, int j, String word, int idx) {
        if (idx == word.length()) return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) return false;
        if (visited[i][j] || board[i][j] != word.charAt(idx)) return false;

        visited[i][j] = true;

        boolean found =
                dfs(i, j + 1, word, idx + 1) ||
                dfs(i, j - 1, word, idx + 1) ||
                dfs(i + 1, j, word, idx + 1) ||
                dfs(i - 1, j, word, idx + 1);

        visited[i][j] = false;
        return found;
    }

    public static boolean calculate(int i, int j, char ch) {
        return false;
    }

    public static boolean check(char ch, String str) {
        return true;
    }
}
