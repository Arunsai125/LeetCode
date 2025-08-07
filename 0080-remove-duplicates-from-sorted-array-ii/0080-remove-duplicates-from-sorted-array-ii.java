class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=2) return n;
        int swap = 2;
        for(int i=2;i<n;i++){
            if(nums[i]!=nums[swap-2]){
                nums[swap] = nums[i];
                swap++;
            }
        }
    return swap;
    }
}