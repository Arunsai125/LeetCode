class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length/2;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                int count=2;
                if(count==n) return nums[i];
                int val = nums[i];
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==val){
                         count++;
                          if(count==n) return val;
                    }
                    else break;
                }
            }
        }
    return -1;
    }
}