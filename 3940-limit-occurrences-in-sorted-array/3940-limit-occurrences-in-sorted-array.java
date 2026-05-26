class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        int temp=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                temp++;
            }
            if(nums[i]!=nums[i-1]){
                temp=1;
            }
            if(temp<=k) list.add(nums[i]);
            else continue;
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
    return ans;
    }
}