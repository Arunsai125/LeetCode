class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> keys = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key) keys.add(i);
        }
        for(int i=0;i<nums.length;i++){
            for(int j : keys){
                if(Math.abs(j-i) <= k){
                    ans.add(i);
                    break;
                }
            }
        }
    return ans;
    }
}