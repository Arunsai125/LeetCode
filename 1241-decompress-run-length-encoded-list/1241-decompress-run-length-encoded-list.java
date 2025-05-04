class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length-1;i+=2){
            int val = nums[i+1];
            int freq = nums[i];
            for(int j=0;j<freq;j++){
                list.add(val);
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
    return ans;
    }
}