class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                int t1=mid;
                int t2=mid;
                while(t1>=0 && nums[t1]==target)t1--;
                while(t2<nums.length && nums[t2]==target) t2++;
                ans[0] = t1+1;
                ans[1] = t2-1;
                break;
            }
            else if(nums[mid]<target) start = mid+1;
            else end = mid-1; 
        }
    return ans;
    }
}