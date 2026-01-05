class Solution {
    public boolean rotateString(String s, String goal) {
        return (s+s).indexOf(goal) != -1 && s.length()==goal.length();
    }
}