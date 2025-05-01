class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int target = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++) target = Math.min(target, arr[i]-arr[i-1]);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i] - arr[i-1]==target){
                List<Integer> temp = new ArrayList<>(Arrays.asList(arr[i-1],arr[i]));
                ans.add(temp);
            }
        }
    return ans;
    }
}