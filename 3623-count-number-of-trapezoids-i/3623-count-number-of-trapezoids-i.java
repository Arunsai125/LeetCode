class Solution {
    public int countTrapezoids(int[][] points) {
        long mod = 1000000007;
        long inv2 = 500000004; 

        Map<Integer, Integer> map = new HashMap<>();

        for (int[] point : points) {
            int y = point[1];
            map.put(y, map.getOrDefault(y, 0) + 1);
        }

        long sum1 = 0;
        long sum2 = 0;

        for (int key : map.keySet()) {
            long val = map.get(key);
            long temp = (val * (val - 1) / 2) % mod; 

            sum1 = (sum1 + temp) % mod;
            sum2 = (sum2 + (temp * temp) % mod) % mod;
        }

        long result = (((sum1 * sum1) % mod - sum2 + mod) % mod) * inv2 % mod;

        return (int) result;
    }
}
