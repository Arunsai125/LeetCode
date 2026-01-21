class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int num = nums.get(i);
            if((num & (1<<0)) == 0) ans[i] = -1;
            else{
                for(int j=1;j<32;j++){
                    if((num & (1<<j)) != 0) continue;
                    int prev = j-1;
                    ans[i] = ((num ^ (1<<prev)));
                    break;
                }
            }
        }
    return ans;
    }
}