class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num<10) return true;
        String str = String.valueOf(num);
        return str.charAt(0) != '0' && str.charAt(str.length()-1) != '0';
    }
}