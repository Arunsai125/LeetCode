class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);
            if(!Character.isLetterOrDigit(ch1)) left++;
            else if(!Character.isLetterOrDigit(ch2)) right--;
            else if(Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) return false;
            else{
                left++;
                right--;
            }
        }
    return true;
    }
}