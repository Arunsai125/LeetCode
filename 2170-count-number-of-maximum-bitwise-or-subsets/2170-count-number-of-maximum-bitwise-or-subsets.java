class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int target = 0;
        for (int num : nums) target |= num;
        return dfs(nums, 0, 0, target);
    }

    private int dfs(int[] nums, int index, int currentOr, int target) {
        if (index == nums.length) {
            return currentOr == target ? 1 : 0;
        }
        int with = dfs(nums, index + 1, currentOr | nums[index], target);
        int without = dfs(nums, index + 1, currentOr, target);
        return with + without;
    }
}
