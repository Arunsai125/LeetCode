class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i:nums){
            String temp = String.valueOf(i);
            if(temp.length()%2==0) ans++;
        }
    return ans;
    }
}