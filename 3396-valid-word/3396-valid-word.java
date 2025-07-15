class Solution {
    public boolean isValid(String word) {
        int vowels=0;
        int consonents=0;
        if(word.length() < 3) return false;
        for(int i=0;i<word.length();i++){
            char ch = Character.toLowerCase(word.charAt(i));
            if(!Character.isLetterOrDigit(ch)) return false;
            else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') vowels++;
            else if(Character.isLetter(ch)) consonents++;
            else continue;
        }
    return vowels>=1 && consonents>=1;
    }
}