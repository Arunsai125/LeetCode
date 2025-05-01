class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length , diff;
        for(int i = 1; i < n; i++){
            diff = arr[i] - arr[i - 1];
            if(diff < min){
                res.clear();
                min = diff;
                res.add(new ArrayList(Arrays.asList(arr[i - 1] , arr[i])));
            }else if(diff == min){
                res.add(new ArrayList(Arrays.asList(arr[i - 1] , arr[i])));
            }
        }

        return res;
    }
}