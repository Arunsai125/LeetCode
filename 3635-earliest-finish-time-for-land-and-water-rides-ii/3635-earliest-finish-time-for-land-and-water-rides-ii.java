class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landFirst = function(landStartTime, landDuration, waterStartTime, waterDuration);
        int waterFirst = function(waterStartTime, waterDuration, landStartTime, landDuration);
        return Math.min(landFirst, waterFirst);
    }
    public int function(int[] arr1, int d1[], int[] arr2, int d2[]){
        int min1 = Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++){
            min1 = Math.min(min1, arr1[i]+d1[i]);
        }
        int ans = Integer.MAX_VALUE;
        for(int j=0;j<arr2.length;j++){
            ans = Math.min(ans, min1 + ( (arr2[j]>min1) ? arr2[j]-min1+d2[j] : d2[j]) );
        }
    return ans;
    }
}