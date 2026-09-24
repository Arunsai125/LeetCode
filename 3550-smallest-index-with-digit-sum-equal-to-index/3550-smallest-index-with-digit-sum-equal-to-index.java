class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int value = countSum(nums[i]);
            if(value==i) return i;
        }
    return -1;
    }
    public int countSum(int num){
        int ans=0;
        while(num!=0){
            int d = num%10;
            ans+=d;
            num/=10;
        }
    return ans;
    }
}