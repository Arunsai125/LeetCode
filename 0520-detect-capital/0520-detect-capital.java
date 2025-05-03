class Solution {
    public boolean detectCapitalUse(String word) {
        boolean case1 = function1(word);
        boolean case2 = function2(word);
        boolean case3 = function3(word);
    return (case1 || case2 || case3);
    }
    public boolean function1(String word){
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>='A' && ch<='Z') continue;
            else return false;
        }
    return true;
    }
    public boolean function2(String word){
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>='a' && ch<='z') continue;
            else return false;
        }
    return true;
    }
    public boolean function3(String word){
        if(!(word.charAt(0) >='A' && word.charAt(0)<='Z')) return false;
        for(int i=1;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>='a' && ch<='z') continue;
            else return false;
        }
    return true;
    }
}