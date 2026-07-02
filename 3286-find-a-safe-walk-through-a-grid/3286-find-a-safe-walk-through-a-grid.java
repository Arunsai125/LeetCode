import java.util.*;

class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();

        int startHealth = health - grid.get(0).get(0);
        if (startHealth <= 0) return false;

        boolean[][][] visited = new boolean[m][n][health + 1];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, startHealth});
        visited[0][0][startHealth] = true;

        int[][] dirs = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            int r = curr[0];
            int c = curr[1];
            int h = curr[2];

            if (r == m - 1 && c == n - 1) {
                return true;
            }

            for (int[] dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                int newHealth = h - grid.get(nr).get(nc);

                if (newHealth > 0 && !visited[nr][nc][newHealth]) {
                    visited[nr][nc][newHealth] = true;
                    queue.offer(new int[]{nr, nc, newHealth});
                }
            }
        }

        return false;
    }
}