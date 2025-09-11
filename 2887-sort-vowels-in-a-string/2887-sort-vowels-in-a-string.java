class Solution {
    public String sortVowels(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        char[] arr = s.toCharArray();
        for(char ch : arr){
            if(set.contains(ch)) count ++;
        }
        char[] temp = new char[count];
        int ptr=0;
        for(char ch : arr){
            if(set.contains(ch)) temp[ptr++] = ch;
        }
        ptr=0;
        Arrays.sort(temp);
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                arr[i] = temp[ptr++];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
    return sb.toString();
    }    
}