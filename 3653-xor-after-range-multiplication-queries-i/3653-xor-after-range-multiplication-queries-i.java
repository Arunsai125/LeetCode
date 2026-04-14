class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int ans = 0;
        long mod = 1_000_000_007;
        for(int[] query : queries){
            int start = query[0];
            int end = query[1];
            int inc = query[2];
            int factor = query[3];
            while(start <= end){
                nums[start] = (int)  (((long)nums[start] * (long)factor) % mod) ;
                start = start + inc;
            }
        }
        for(int i : nums) ans = ans^i;
    return ans;
    }
}