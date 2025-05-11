class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest_sum = Integer.MAX_VALUE / 2;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(sum - target) < Math.abs(closest_sum - target)) closest_sum = sum;
                if(sum==target) return target;
                else if(sum < target) j++;
                else k--;
            }
        }
    return closest_sum;
    }
}