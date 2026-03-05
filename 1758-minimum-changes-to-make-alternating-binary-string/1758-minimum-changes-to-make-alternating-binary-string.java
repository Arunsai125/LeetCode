class Solution {
    public int minOperations(String s) {
        int length = s.length();
        String str1 = generateStringStartingWithOne(length);
        String str2 = generateStringStartingWithZero(length);
        int diff1 = findTheDifference(s,str1);
        int diff2 = findTheDifference(s,str2);
    return Math.min(diff1, diff2);
    }
    public String generateStringStartingWithOne(int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(i%2==0) sb.append('1');
            else sb.append('0');
        }
    return sb.toString();
    }
    public String generateStringStartingWithZero(int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(i%2==0) sb.append('0');
            else sb.append('1');
        }
    return sb.toString();
    }
    public int findTheDifference(String s1,String s2){
        int ans=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)) ans++;
        }
    return ans;
    }
}