class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int nse[] = new int[n];
        int pse[] = new int[n];
        findNSE(heights, nse, n);
        findPSE(heights, pse, n);
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = Math.max(ans, (nse[i] - pse[i] - 1) * heights[i]);
        }
    return ans;
    }
    public void findNSE(int[] heights, int[] nse, int n){
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
    }
    public void findPSE(int[] heights, int[] pse, int n){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
    }
}