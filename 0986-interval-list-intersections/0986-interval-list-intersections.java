class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0;
        int j = 0;
        List<int[]> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        while(i<firstList.length && j<secondList.length){
            start = Math.max(firstList[i][0], secondList[j][0]);
            end = Math.min(firstList[i][1], secondList[j][1]);
            if(end >= start) list.add(new int[]{start,end});
            if(end == firstList[i][1]) i++;
            if(end == secondList[j][1]) j++;
        }
    return list.toArray(new int[list.size()][2]);
    }
}