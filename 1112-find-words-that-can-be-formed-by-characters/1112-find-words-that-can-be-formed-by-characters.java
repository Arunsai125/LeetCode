class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] arr = new int[26];
        for(int i=0;i<chars.length();i++){
            arr[chars.charAt(i)-'a']++;
        }
        int ans=0;
        for(String word : words){
            int[] temp = Arrays.copyOf(arr,26);
            int flag=0;
            for(int i=0;i<word.length();i++){
                if(temp[word.charAt(i)-'a']==0) flag=1;
                else{
                    temp[word.charAt(i)-'a']--;
                }
            }
            if(flag==0) ans += word.length();
        }
    return ans;
    }
}