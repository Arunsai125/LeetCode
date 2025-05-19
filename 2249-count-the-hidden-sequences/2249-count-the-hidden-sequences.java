class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int max=0,min=0,curr=0;
        for(int i : differences){
            curr += i;
            min = Math.min(min,curr);
            max = Math.max(max, curr);
            if( max-min > upper-lower) return 0;
        }
        return upper-lower - (max-min) + 1; 
    }
}