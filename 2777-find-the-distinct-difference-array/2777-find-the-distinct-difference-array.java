class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            prefix[i] = set.size();
        }
        set.clear();
        set.add(nums[nums.length-1]);
        for(int i=nums.length-2;i>=0;i--){
            suffix[i] = set.size();
            set.add(nums[i]);
        }
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++) ans[i] = prefix[i] - suffix[i];
    return ans;
    }
}