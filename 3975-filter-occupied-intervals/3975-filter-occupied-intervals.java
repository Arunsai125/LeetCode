class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        List<List<Integer>> merged = new ArrayList<>();
        Arrays.sort(occupiedIntervals, (a, b) -> a[0] - b[0]);
        merged.add(new ArrayList<>(Arrays.asList(occupiedIntervals[0][0], occupiedIntervals[0][1])));
        for (int i = 1; i < occupiedIntervals.length; i++) {
            int lastStart = merged.get(merged.size() - 1).get(0);
            int lastEnd = merged.get(merged.size() - 1).get(1);
            int currStart = occupiedIntervals[i][0];
            int currEnd = occupiedIntervals[i][1];
            if (currStart <= lastEnd + 1) {
                merged.get(merged.size() - 1).set(1, Math.max(lastEnd, currEnd));
            } else {
                merged.add(new ArrayList<>(Arrays.asList(currStart, currEnd)));
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (List<Integer> interval : merged) {
            int start = interval.get(0);
            int end = interval.get(1);
            if (end < freeStart || start > freeEnd) {
                ans.add(new ArrayList<>(Arrays.asList(start, end)));
            } else {
                if (start < freeStart) {
                    ans.add(new ArrayList<>(Arrays.asList(start, freeStart - 1)));
                }
                if (end > freeEnd) {
                    ans.add(new ArrayList<>(Arrays.asList(freeEnd + 1, end)));
                }
            }
        }
        return ans;
    }
}