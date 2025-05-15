class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int ans=n;
        int c=n;
            int[][] matrix = new int[n][n];
            for(int i=0;i<n;i++){
                Arrays.fill(matrix[i],(int)1e9);
                matrix[i][i]=0;
            }
            for(int edge[] : edges){
                matrix[edge[0]][edge[1]] = edge[2];
                matrix[edge[1]][edge[0]] = edge[2];
            }
            for(int src=0;src<n;src++){
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][src] + matrix[src][j]);
                    }
                }
            }
            for(int src=0;src<n;src++){
                int temp=0;
                for(int i=0;i<n;i++){
                    if(src==i) continue;
                    if(matrix[src][i] <= distanceThreshold) temp++;
                }
                if(temp<=c){
                    c=temp;
                    ans=src;
                }
            }
    return ans;
    }
}