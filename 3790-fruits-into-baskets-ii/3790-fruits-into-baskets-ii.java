class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans = fruits.length;
        //boolean[] visited = new boolean[1001];
        for(int i : fruits){
            for(int j=0;j<baskets.length;j++){
                if(baskets[j] >= i){
                    ans--;
                    //visited[j] = true;
                    baskets[j]=-1;
                    break;
                }
            }
        }
    return ans;
    }
}