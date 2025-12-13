class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
                int[] minX = new int[n + 1];
        int[] maxX = new int[n + 1];
        int[] minY = new int[n + 1];
        int[] maxY = new int[n + 1];
        Arrays.fill(minX, Integer.MAX_VALUE);
        Arrays.fill(minY, Integer.MAX_VALUE);
        for (int[] building : buildings) {
            int x = building[0];
            int y = building[1];
            minX[y] = Math.min(minX[y], x);
            maxX[y] = Math.max(maxX[y], x);
            minY[x] = Math.min(minY[x], y);
            maxY[x] = Math.max(maxY[x], y);
        }

        int result = 0;
        for (int[] building : buildings) {
            int x = building[0];
            int y = building[1];
            if (x > minX[y] && x < maxX[y] && y > minY[x] && y < maxY[x]) {
                result++;
            }
        }
        return result;
    }
}