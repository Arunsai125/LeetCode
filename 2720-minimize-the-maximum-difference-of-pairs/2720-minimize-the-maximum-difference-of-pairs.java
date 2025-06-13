class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int ans=-1;
        int start = 0;
        int end = nums[nums.length-1] - nums[0];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(canMakePairs(nums,p,mid)){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
    return ans;
    }
    public boolean canMakePairs(int[] nums, int target, int curr){
        int pairs=0;
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length && nums[i+1] - nums[i] <= curr){
                pairs++;
                i++;
            }
        }
    return pairs >= target;
    }
}