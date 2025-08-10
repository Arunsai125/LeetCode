class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] nge = new int[temperatures.length];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) st.pop();
            if(st.isEmpty()) 
                nge[i] = 0;
            else nge[i] = st.peek();
        st.push(i);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(nge[i]==0) continue;
            ans[i] = nge[i] - i;
        }
    return ans;
    }
}