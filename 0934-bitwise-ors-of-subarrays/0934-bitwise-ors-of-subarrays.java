class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> endingHere = new HashSet<>();
        Set<Integer> endingBefore = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            endingHere.clear();
            endingHere.add(arr[i]);
            ans.add(arr[i]);
            for(int num : endingBefore){
                endingHere.add( num | arr[i] );
                ans.add( num | arr[i]);
            }
            endingBefore = new HashSet<>(endingHere);
        }
    return ans.size();
    }
}