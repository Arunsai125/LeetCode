class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1));
        for(int i=2;i<=numRows;i++){
            ans.add(generateRow(i));
        }
    return ans;
    }
    public List<Integer> generateRow(int n){
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(findElement(n-1, i-1));
        }
    return ans;
    }
    public int findElement(int n, int r){
        long ans=1;
        for(int i=1;i<=r;i++){
            ans =  (ans * (n-i+1)) / i;
        }
    return (int) ans;
    }
}