class Solution {
    public int minMoves(int target, int maxDoubles) {
        int ans = 0;
        while(maxDoubles > 0 && target!=1){
            maxDoubles--;
            ans += target%2;
            ans++;
            target = target/2;
        }
        if(target > 1) ans += target - 1;
    return ans;
    }
}