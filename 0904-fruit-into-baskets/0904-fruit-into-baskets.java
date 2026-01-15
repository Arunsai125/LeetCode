class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        int left = 0;
        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);
            while(map.size() > 2){
                int val = fruits[left];
                if(map.get(val)==1) map.remove(val);
                else map.put(val, map.get(val)-1);
            left++;
            }
            ans = Math.max(ans, right-left+1);
        }
    return ans;
    }
}