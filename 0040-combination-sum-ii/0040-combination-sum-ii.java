class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        recursion(candidates, 0, target, temp, ans);
    return ans;
    }
    public void recursion(int[] array, int ind, int sum,  List<Integer> temp,  List<List<Integer>> ans){
       if(sum==0){
        ans.add(new ArrayList<>(temp));
        return;
       }
       for(int i=ind;i<array.length;i++){
            if(i>ind && array[i] == array[i-1]) continue;
            if(array[i] > sum) break;
            temp.add(array[i]);
            recursion(array, i+1, sum-array[i], temp, ans);
            temp.remove((Integer)array[i]);
       }
    }
}