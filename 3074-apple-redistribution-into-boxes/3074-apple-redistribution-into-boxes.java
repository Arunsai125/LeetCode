class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples = 0;
        for(int each : apple) totalApples += each;
        Arrays.sort(capacity);
        int ans = 0;
        for(int i=capacity.length-1; i>=0; i--){
            if(totalApples <= 0) return ans;
            totalApples -= capacity[i];
            ans ++;
        }
    return ans;
    }
}