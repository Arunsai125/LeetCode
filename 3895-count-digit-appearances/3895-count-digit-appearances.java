class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;
        char target = (char) ('0' + digit);
        for(int i : nums){
            String str = String.valueOf(i);
            for(char ch : str.toCharArray()){
                if(ch == target) ans++;
            }
        }
    return ans;
    }
}