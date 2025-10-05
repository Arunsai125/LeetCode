class Pair{
    private int r;
    private int c;
    public Pair(int r, int c){
        this.r=r;
        this.c=c;
    }
    public int getR(){ return this.r; }
    public int getC(){ return this.c; }
}


class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] vis1 = new boolean[m][n];
        boolean[][] vis2 = new boolean[m][n];
        int[] row = {-1,0,1,0};
        int[] col = {0,1,0,-1};
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        // Iteration Atlantic Ocean
            for(int i=0;i<n-1;i++) {
                int val = ((m-1) * n) + i;
                q.add(new Pair(m-1,i));
                vis1[m-1][i] = true;
                map.put(val, map.getOrDefault(val,0)+1);
            }
            for(int i=0;i<m;i++){
                int val = (i * n) + (n-1);
                q.add(new Pair(i,n-1));
                vis1[i][n-1] = true;
                map.put(val, map.getOrDefault(val,0)+1);
            }
            updateMap(row,col,q,map,heights,m,n,vis1);
        // Iteration Pacific Ocean
        q.clear();
            for(int i=0;i<n;i++) {
                int val = (0 * n) + i;
                q.add(new Pair(0,i));
                vis2[0][i] = true;
                map.put(val, map.getOrDefault(val,0)+1);
            }
            for(int i=1;i<m;i++){
                int val = (i * n) + (0);
                q.add(new Pair(i,0));
                vis2[i][0] = true;
                map.put(val, map.getOrDefault(val,0)+1);
            }
            updateMap(row,col,q,map,heights,m,n,vis2);
        List<List<Integer>> ans = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key)==2){
                int r = key/n;
                int c = key%n;
                ans.add(Arrays.asList(r,c));
            }
        }
    return ans;
    }

    public void updateMap(int[] row, int[] col, Queue<Pair> q, Map<Integer, Integer> map, int[][] heights, int m, int n, boolean[][] vis1){
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                Pair temp = q.poll();
                int r = temp.getR();
                int c = temp.getC();
                for(int j=0;j<4;j++){
                    int newR = r + row[j];
                    int newC = c + col[j];
                    if(newR>=0 && newR<m && newC>=0 && newC<n && vis1[newR][newC]==false && heights[newR][newC]>=heights[r][c]){
                            vis1[newR][newC] = true;
                            q.add(new Pair(newR, newC));
                            int val = newR*n + newC;
                            map.put(val, map.getOrDefault(val,0)+1);
                    }
                }
            }
        }
    }
}