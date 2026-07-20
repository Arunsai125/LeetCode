class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k){
        List<Integer> list = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                list.add(grid[i][j]);
            }
        }
        k = k % (list.size());
        int start = (k * (-1)) + list.size();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
            for(int j=0;j<m;j++){
                ans.get(i).add(list.get(start%list.size()));
                start++;
            }
        }
    return ans;
    }
}