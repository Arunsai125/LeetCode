class Solution {
    public int largestInteger(int[] nums, int k) {
        int ans=-1;
        if(nums.length==k){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length-k+1;i++){
            for(int j=i;j<i+k;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
        }
        for(int i : map.keySet()){
            if(map.get(i)==1) ans = Math.max(ans,i);  
        }
    return ans;
    }
}