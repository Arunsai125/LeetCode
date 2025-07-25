class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private Map<Integer,Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        map = new HashMap<>();
        for(int i : nums2) map.put(i, map.getOrDefault(i,0)+1);
    }
    
    public void add(int index, int val) {
        int newVal = nums2[index] + val;
        int oldVal = nums2[index];
        map.put(oldVal, map.get(oldVal)-1);
        map.put(newVal, map.getOrDefault(newVal,0)+1);
        nums2[index] += val;
    }
    
    public int count(int tot) {
        int ans=0;
        for(int i : nums1){
            int reqVal = tot-i;
            if(map.containsKey(reqVal)) ans += map.get(reqVal);
        }
    return ans;
    }
}