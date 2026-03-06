class Solution {
    public boolean checkOnesSegment(String s) {
        boolean found = false;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='1' && found==true) return false;
            if(s.charAt(i)=='1'){ continue; }
            else {
                found = true; 
                continue;
            }
        }
    return true;
    }
}