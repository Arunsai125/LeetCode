class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int ptr=0;
        int[] freq = new int[101];
        for(int i : nums){
            freq[i]++;
            if(freq[i]==2) ans[ptr++] = i;
        }
    return ans;
    }
}