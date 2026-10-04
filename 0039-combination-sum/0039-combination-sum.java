class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        recursion(candidates, target, candidates.length-1, temp, ans);
    return ans;
    }
    public void recursion(int[] array, int target, int ind, List<Integer> temp, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(ind<0) return;
        if(array[ind] <= target) {
            temp.add(array[ind]);
            recursion(array, target-array[ind], ind, temp, ans);
            temp.remove(temp.size()-1);
        }
        recursion(array, target, ind-1, temp, ans);
    return;
    }
}