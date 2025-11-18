class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int start = 0;
        while(start < bits.length){
            if(bits[start]==1) start+=2;
            if(start > bits.length-1) return false;
            if(bits[start]==0) start++;
        }
    return true;
    }
}