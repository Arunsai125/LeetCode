class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            int firstAddition = landStartTime[i] + landDuration[i];
            for(int j=0;j<waterStartTime.length;j++){
                int temp = firstAddition + waterDuration[j];
                if(waterStartTime[j] > firstAddition) temp += waterStartTime[j] - firstAddition;
                ans = Math.min(ans, temp);
            }
        }
        for(int i=0;i<waterStartTime.length;i++){
            int firstAddition = waterStartTime[i] + waterDuration[i];
            for(int j=0;j<landStartTime.length;j++){
                int temp = firstAddition + landDuration[j];
                if(landStartTime[j] > firstAddition) temp += landStartTime[j] - firstAddition;
                ans = Math.min(ans, temp);
            }
        }
    return ans;
    }
}