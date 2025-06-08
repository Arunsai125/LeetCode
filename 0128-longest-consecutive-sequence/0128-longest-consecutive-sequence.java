class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int c=1,ans=1;
        Set<Integer> set = new TreeSet<>();
        for(int i : nums) set.add(i);
        for(int i : set){
            if(set.contains(i+1)){
                c++;
                ans=Math.max(ans,c);
            }
            else c=1;
        }
    return ans;
    }
}