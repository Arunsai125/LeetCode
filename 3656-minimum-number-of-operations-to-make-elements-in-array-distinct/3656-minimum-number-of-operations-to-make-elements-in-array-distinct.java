class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums) map.put(i,map.getOrDefault(i,0)+1);
        if(map.size()==nums.length) return 0;
        int ans=0;
        int i=0;
        while(i<nums.length){
            if(nums.length<3){
                ans++;
                break;
            }
            for(int j=i;j<i+3 && j<nums.length;j++){
                map.put(nums[j],map.get(nums[j])-1);
                if(map.get(nums[j])==0) map.remove(nums[j]);
            }
            ans++;
            if(nums.length - 3*(ans)==map.size()) break;
            else i+=3;
        }
    return ans;
    }
}