class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i :  nums1) list.add(i);
        for(int i : nums2) list.add(i);
        Collections.sort(list);
        if(list.size()%2==0){
            return ((double)list.get(list.size()/2) + (double)list.get(list.size()/2 - 1)) / 2.0;
        }
    return (double) list.get(list.size()/2);
    }
}