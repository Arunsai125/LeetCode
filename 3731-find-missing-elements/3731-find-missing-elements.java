class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>  ans = new ArrayList<>();
        int min = 101;
        int max = -1;
        int[] freq = new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        for(int i=min+1;i<max;i++){
            if(freq[i]==0) ans.add(i);
        }
    return ans;
    }
}