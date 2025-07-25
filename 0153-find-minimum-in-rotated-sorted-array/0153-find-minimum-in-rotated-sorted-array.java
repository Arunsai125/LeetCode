class Solution {
    public int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[start]<=nums[mid]){
                ans = Math.min(ans, nums[start]);
                start = mid+1;
            }
            else{
                ans = Math.min(ans, nums[mid]);
                end=mid-1;
            }
        }
    return ans;
    }
}