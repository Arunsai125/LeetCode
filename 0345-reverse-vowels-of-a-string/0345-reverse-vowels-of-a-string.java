class Solution {
    public String reverseVowels(String s) {
       Set<Character> set = new HashSet<>();
       set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u'); 
       set.add('A'); set.add('E'); set.add('I'); set.add('O'); set.add('U');
       int left=0;
       int right=s.length()-1;
       char[] arr = s.toCharArray();
       while(left < right){
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);
            if(!set.contains(ch1)) left++;
            if(!set.contains(ch2)) right--;
            if(set.contains(ch2) && set.contains(ch1)){
                arr[left] = ch2;
                arr[right] = ch1;
                left++;
                right--;
            }
       }
    return new String(arr);
    }
}