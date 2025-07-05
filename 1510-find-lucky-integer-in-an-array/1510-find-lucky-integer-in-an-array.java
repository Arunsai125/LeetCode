class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];
        for(int i : arr) freq[i]++;
        int c=0;
        int ans=-1;
        for(int i=1;i<freq.length;i++){
            if(freq[i]==i && freq[i]>c){
                c = freq[i];
                ans=i;
            }
        }
    return ans;
    }
}