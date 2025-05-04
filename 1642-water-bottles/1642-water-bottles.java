class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles>=numExchange){
            int factor = numBottles/numExchange;
            int rem = numBottles%numExchange;
            ans += factor;
            numBottles = factor+rem;
        }
    return ans;
    }
}