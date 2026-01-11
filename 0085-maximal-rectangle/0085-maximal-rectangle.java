class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] grid = new int[n][m];
        for(int j=0;j<m;j++){
            int psum = 0;
            for(int i=0;i<n;i++){
                psum += matrix[i][j] - '0';
                if(matrix[i][j] == '0'){
                    psum = 0;
                    grid[i][j] = 0;
                }
                else grid[i][j] = psum;
            }
        }
        int ans = 0;
        for(int[] arr : grid){
            ans = Math.max(ans, largestRectangleInHistogram(arr));
        }
    return ans;
    }
    public int largestRectangleInHistogram(int arr[]){
        int ans = 0;
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                int element = arr[st.pop()];
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                ans = Math.max(ans, element * (nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int element = arr[st.pop()];
            int nse = n;
            int pse = st.isEmpty() ? -1 : st.peek();
            ans = Math.max(ans, element * (nse - pse-1));
        }
    return ans;
    }
}