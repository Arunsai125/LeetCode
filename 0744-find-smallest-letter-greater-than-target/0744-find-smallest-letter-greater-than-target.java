class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        if(ans-'a' > target-'a') return ans;
        for(int i=1;i<letters.length;i++){
            char temp = letters[i];
            if(temp-'a' > target-'a') return temp;
        }
    return ans;
    }
}