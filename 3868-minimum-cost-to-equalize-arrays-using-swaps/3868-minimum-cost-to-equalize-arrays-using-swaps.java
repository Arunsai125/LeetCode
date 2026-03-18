class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            freq.put(num, freq.getOrDefault(num, 0) - 1);
        }
        int totalDiff = 0;
        for (int val : freq.values()) {
            if (val % 2 != 0) return -1; 
            totalDiff += Math.abs(val);
        }
        return totalDiff / 4;
    }
}