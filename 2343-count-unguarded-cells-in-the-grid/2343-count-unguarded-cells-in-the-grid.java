class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] state = new int[m][n];
        for (int[] w : walls) state[w[0]][w[1]] = 1;
        for (int[] g : guards) state[g[0]][g[1]] = 1;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int[] g : guards) {
            int gx = g[0], gy = g[1];
            for (int d = 0; d < 4; d++) {
                int x = gx + dx[d], y = gy + dy[d];
                while (x >= 0 && x < m && y >= 0 && y < n) {
                    if (state[x][y] == 1) break;
                    state[x][y] = 2;
                    x += dx[d];
                    y += dy[d];
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (state[i][j] == 0) ans++;
        return ans;
    }
}
