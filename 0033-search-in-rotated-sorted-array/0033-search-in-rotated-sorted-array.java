class Solution {
    public int search(int[] nums, int target) {
        if(nums[0]==target) return 0;
        if(nums[nums.length-1]==target) return nums.length-1;
        int start=1;
        int end=nums.length-2;
        int ans=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[start]<=nums[mid]){
                if(nums[mid]<=target) end=mid-1;
                else start = mid+1;
            }
            else{
                if(nums[mid]<=target) start = mid+1;
                else  end=mid-1;
            }
        }
    return ans;
    }
}