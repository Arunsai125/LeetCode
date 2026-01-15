class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int targetSize = n - k;
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        int totalSum = 0;
        for(int right=0;right<n;right++){
            totalSum += cardPoints[right];
            sum += cardPoints[right];
            if(right-left+1 > targetSize){
                sum -= cardPoints[left];
                left++;
            }
            if(right-left+1 == targetSize) ans = Math.min(ans, sum);
        }
    if(k==n) return totalSum;
    return totalSum - ans;
    }
}