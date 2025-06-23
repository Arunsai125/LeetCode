class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        int ans=nums[0];
        for(int i : nums){
            start = Math.max(start,i);
            end += i;
        }
        if(k==nums.length) return start;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isPossible(nums,mid,k)){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
    return ans;
    }
    public boolean isPossible(int[] nums, int curr, int target){
        int temp=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum > curr){
                temp++;
                sum = nums[i];
            }
            if(temp > target) return false;
        }
        if(sum <= curr) temp++;
    return temp<=target;
    }
}