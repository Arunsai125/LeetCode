class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> even = new HashSet<>();
            Set<Integer> odd = new HashSet<>();
            for (int j = i; j < n; j++) {
                int num = nums[j];
                if (num % 2 == 0) even.add(num);
                else odd.add(num);
                if (even.size() == odd.size()) ans = Math.max(ans, j - i + 1);
                if(ans==nums.length) return nums.length;
            }
        }
        return ans;
    }
}