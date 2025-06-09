class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> temp = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        temp.add(Arrays.asList(intervals[0][0],intervals[0][1]));
        for(int i=1;i<intervals.length;i++){
            int prevVal = temp.get(temp.size()-1).get(1);
            int curVal = intervals[i][0];
            if(curVal <= prevVal){
                temp.get(temp.size()-1).set(1, Math.max(prevVal, intervals[i][1]));
            }
            else{
                temp.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }
        }
        int[][] ans = new int[temp.size()][2];
        for(int i=0;i<temp.size();i++){
            ans[i][0] = temp.get(i).get(0);
            ans[i][1] = temp.get(i).get(1);
        }
    return ans; 
    }
}