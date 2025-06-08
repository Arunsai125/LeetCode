class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1));
        if(numRows==1) return ans;
        for(int i=2;i<=numRows;i++){
            ans.add(generateRow(i));
        }
    return ans;
    }
    public List<Integer> generateRow(int n){
        List<Integer> row = new ArrayList<>();
        for(int i=1;i<=n;i++){
            row.add(findElement(n-1,i-1));
        }
    return row;
    }
    public int findElement(int r, int c){
        long ans=1;
        for(int i=1;i<=c;i++){
            ans = ans * (r-i+1) / i;
        }
    return (int) ans;
    }
}