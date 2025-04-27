class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[1001];
        for(int i=0;i<nums1.length;i++){
            if(arr[nums1[i]]==0) arr[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            if(arr[nums2[i]]!=0 && !list.contains(nums2[i])) list.add(nums2[i]);
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
    return ans;
    }
}