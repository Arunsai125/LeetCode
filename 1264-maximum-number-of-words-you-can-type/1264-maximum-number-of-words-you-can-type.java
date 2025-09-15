class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        Set<Character> set = new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++) set.add(brokenLetters.charAt(i));
        int ans = 0;
        for(String str : words){
            boolean flag=true;
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(set.contains(ch)){
                    flag=false;
                    break;
                }
            }
            if(flag) ans++;
        }
    return ans;
    }
}