class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        if(nums.length==0) return 0;
        int ans=1;
        int c=0;
        for(int i : nums) set.add(i);
        for(int i : set){
            int temp=i;
            if(!set.contains(temp+1)) continue;
            else{
                c=1;
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