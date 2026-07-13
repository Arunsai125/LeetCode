class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(arr);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr) map.putIfAbsent(i, map.size()+1);
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = map.get(temp[i]);
        }
    return ans;
    }
}