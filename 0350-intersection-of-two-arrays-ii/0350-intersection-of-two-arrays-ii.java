class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) return intersect(nums2,nums1);
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[1001];
        for(int i : nums1) arr[i]++;
        for(int i : nums2){
            if(arr[i]>0){
                list.add(i);
                arr[i]--;
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
    return ans;
    }
}