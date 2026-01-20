class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        for(int i=0;i<ans.length;i++){
            if(nums.get(i) == 2) ans[i] = -1;
            else{
                int temp = -1;
                for(int j=1;j<nums.get(i);j++){
                    if( (j | (j+1)) == nums.get(i)) { ans[i] = j; break; }
                }
            if(ans[i]==0) ans[i] = temp;
            }
        }
    return ans;
    }
}