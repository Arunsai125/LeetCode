class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] patterns = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<word.length();i++){
                char ch = word.charAt(i);
                sb.append(patterns[ch-'a']);
            }
        set.add(sb.toString());
        }
    return set.size();
    }
}