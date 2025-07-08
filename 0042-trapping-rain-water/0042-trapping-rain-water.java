class Solution {
    public int trap(int[] height) {
        int ans=0;
        int n = height.length;
        int[] rmax = new int[n];
        rmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--) rmax[i] = Math.max(height[i], rmax[i+1]);
        int lmax=height[0];
        for(int i=1;i<n-1;i++){
            if(height[i]<lmax && height[i]<rmax[i]) ans += (Math.min(lmax,rmax[i]) - height[i]);
            lmax = Math.max(lmax, height[i]);
        }
    return ans;
    }
}