class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int prev = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int temp = Math.min(nums[i]+k, Math.max(prev+1, nums[i]-k));
            prev = temp;
            set.add(temp);
        }
    return set.size();
    }
}