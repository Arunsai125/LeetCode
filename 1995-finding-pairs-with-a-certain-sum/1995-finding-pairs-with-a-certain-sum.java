class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private Map<Integer,Integer> map1;
    private Map<Integer,Integer> map2;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        map1 = new HashMap<>();
        map2 = new HashMap<>();
        for(int i : nums1) map1.put(i, map1.getOrDefault(i,0)+1);
        for(int i : nums2) map2.put(i, map2.getOrDefault(i,0)+1);
    }
    
    public void add(int index, int val) {
        int newVal = nums2[index] + val;
        int oldVal = nums2[index];
        map2.put(oldVal, map2.get(oldVal)-1);
        map2.put(newVal, map2.getOrDefault(newVal,0)+1);
        nums2[index] += val;
    }
    
    public int count(int tot) {
        int ans=0;
        for(int i : map1.keySet()){
            int reqVal = tot-i;
            if(map2.containsKey(reqVal)) ans += map2.get(reqVal) * map1.get(i);
        }
    return ans;
    }
}
