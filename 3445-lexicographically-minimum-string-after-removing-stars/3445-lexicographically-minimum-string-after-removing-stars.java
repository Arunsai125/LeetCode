class Solution {
    public String clearStars(String s) {
        Stack<Integer>[] a = new Stack[26];
        for(int i = 0; i < 26; i++){
            a[i] = new Stack<>();
        }

        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '*'){
                for(int j = 0; j < 26; j++){
                    if(!a[j].isEmpty()){
                        sb.setCharAt(a[j].pop(), '*');
                        break;
                    }
                }
            }else{
                a[c - 'a'].push(i);
            }
        }

        return sb.toString().replace("*", "");
    }
}