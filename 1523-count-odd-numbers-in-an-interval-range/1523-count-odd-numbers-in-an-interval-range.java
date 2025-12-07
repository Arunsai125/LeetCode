class Solution {
    public int countOdds(int low, int high) {
        int diff = (high+1-low)/2;
        if(low%2==1 && high%2==1) diff+=1;
        return diff;
    }
}