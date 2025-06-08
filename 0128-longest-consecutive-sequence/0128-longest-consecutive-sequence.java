class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        if(nums.length==0) return 0;
        for(int i : nums) set.add(i);
        int ans=1;
        int c=0;
        for(int i : nums){
            if(set.contains(i-1) || !set.contains(i+1)) continue;
            else{
                c=1;
                int temp = i;
                while(set.contains(temp+1)){
                    c++;
                    temp++;
                }
                ans = Math.max(ans, c);
            }
        }
    return ans;
    }
}