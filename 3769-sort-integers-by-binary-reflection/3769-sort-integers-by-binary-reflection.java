class Solution {
    public int[] sortByReflection(int[] nums) {
        int[][] temp = new int[nums.length][2];
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int val = binaryReflection(nums[i]);
            temp[i][0] = nums[i];
            temp[i][1] = val;
        }
        Arrays.sort(temp, (a,b) -> {
            if(a[1]==b[1])  return a[0] - b[0];
        return a[1] - b[1];
        });
        for(int i=0;i<ans.length;i++){
            ans[i] = temp[i][0];
        }
    return ans;
    }
    public int binaryReflection(int num){
        StringBuilder str = new StringBuilder(Integer.toBinaryString(num)).reverse();
    return Integer.parseInt(str.toString(), 2);
    }
}