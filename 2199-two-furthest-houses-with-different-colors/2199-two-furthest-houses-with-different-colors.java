class Solution {
    public int maxDistance(int[] colors) {
        int ans=0;
        int colour = colors[0];
        for(int j=0;j<colors.length;j++){
            for(int i=colors.length-1;i>=0;i--){
                if(colors[i] != colors[j]){
                    ans = Math.max(ans, i-j);
                }
            }
        }
    return ans;
    }
}