class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        int[] freq = new int[10001];
        for(int i : nums){
            freq[i]++;
            if(freq[i]==n) return i;
        }
    return -1;
    }
}