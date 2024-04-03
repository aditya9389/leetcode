class Solution {
    public boolean exist(char[][] board, String word) {
        char[] s = word.toCharArray();
        int n = board.length, m = board[0].length, l = s.length;
        boolean[][] dp = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == s[0]) {
                    if(helper(i, j, 0, s, board, dp, n, m, l)) return true;
                }
            }
        }
        return false;
    }
    private boolean helper(int i, int j, int pos, char[] s, char[][] board, boolean[][] dp, int n, int m, int l) {
        if(i >= n || i < 0 || j >= m || j < 0 || dp[i][j] || pos >= l || board[i][j] != s[pos]) return false;
        if(pos == l-1) return true;
        dp[i][j] = true;
        if( helper(i-1, j, pos+1, s, board, dp, n, m, l)
            || helper(i, j+1, pos+1, s, board, dp, n, m, l)
            || helper(i+1, j, pos+1, s, board, dp, n, m, l)
            || helper(i, j-1, pos+1, s, board, dp, n, m, l)) 
                return true;
        dp[i][j] = false;;
        return false;
    }
}
//understandable but need to do this again also this one is copied learn backtracking