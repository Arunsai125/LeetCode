class Solution {
    public List<String> commonChars(String[] words) {
       int[] array = new int[26];
       for(char ch : words[0].toCharArray()){
            array[ch-'a']++;
       }
       for(int i=1;i<words.length;i++){
            int[] temp = new int[26];
            for(char ch : words[i].toCharArray()){
                temp[ch-'a']++;
            }
            for(int j=0;j<26;j++){
                array[j] = Math.min(array[j], temp[j]);
            }
       }
       List<String> ans = new ArrayList<>();
       for(int i=0;i<26;i++){
            if(array[i]!=0){
                String str = String.valueOf((char)('a' + i));
                int temp = array[i];
                while(temp!=0){
                    temp--;
                    ans.add(str);
                }
            }
       }
    return ans;
    }
}