class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans = fruits.length;
        Set<Integer> set = new HashSet<>();
        for(int i : fruits){
            for(int j=0;j<baskets.length;j++){
                if(baskets[j] >= i && !set.contains(j)){
                    ans--;
                    set.add(j);
                    break;
                }
            }
        }
    return ans;
    }
}