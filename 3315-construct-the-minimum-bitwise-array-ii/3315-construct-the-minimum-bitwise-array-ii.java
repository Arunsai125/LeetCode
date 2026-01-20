class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            int x = nums.get(i);
            if ((x & 1) == 0) {
                ans[i] = -1;
                continue;
            }
            int tmp = x;
            int r = 0;
            while ((tmp & 1) == 1) {
                r++;
                tmp >>= 1;
            }
            ans[i] = x - (1 << (r - 1));
        }
        return ans;
    }
}
