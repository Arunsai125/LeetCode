class Solution {
    public long minOperations(int[][] queries) {
        long ans = 0;
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            long operations = 0;
            int power = 0;
            while (true) {
                long lower = (long) Math.pow(4, power);
                long upper = (long) Math.pow(4, power + 1) - 1;
                if (lower > r) break;
                long count = Math.min(r, upper) - Math.max(l, lower) + 1;
                if (count > 0) {
                    operations += count * (power + 1);
                }
                power++;
            }
            ans += (operations + 1) / 2;
        }
        return ans;
    }
}