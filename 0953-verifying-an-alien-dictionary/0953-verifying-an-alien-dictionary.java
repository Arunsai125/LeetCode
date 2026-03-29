class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int n = words.length;
        for(int i=1;i<n;i++){
            String word1 = words[i-1];
            String word2 = words[i];
            if(areLexicographicallyCorrect(word1, word2, order) == false) return false;
            else continue;
        }
    return true;
    }
    public boolean areLexicographicallyCorrect(String word1, String word2, String order){
        if(word1.equals(word2)) return true;
        if(word1.indexOf(word2)==0) return false;
        if(word2.indexOf(word1)==0) return true;
        if(word1.charAt(0) != word2.charAt(0)){
            if(order.indexOf(word1.charAt(0)) > order.indexOf(word2.charAt(0))) return false;
        }
        else{
            int start=0;
            while(start<word1.length() && start<word2.length()){
                if(word1.charAt(start) == word2.charAt(start)) start++;
                else break;
            }
            if(order.indexOf(word1.charAt(start)) > order.indexOf(word2.charAt(start))) return false;
        }
    return true;
    }
}