class Solution {
    public boolean isGood(int[] nums) {
        int max = 0;
        int[] freq = new int[201];
        int c=0;
        for(int i : nums){
            max = Math.max(max,i);
            freq[i]++;
            if(freq[i] > 1) c++;
        }
        if(nums.length != (max+1) || freq[max] != 2 || c>1) return false;
    return true;
    }
}