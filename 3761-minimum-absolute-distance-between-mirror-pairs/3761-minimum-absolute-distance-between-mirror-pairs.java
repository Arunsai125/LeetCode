class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.lengthli++){
            if(!map.containsKey(nums[i])) map.put(nums[i], new ArrayList<>()); 
            map.get(nums[i]).add(i);
        }
        for(int i=0;i<nums.length;i++){
            int rev = findReverse(nums[i]);
        }
    }
}