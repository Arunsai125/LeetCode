class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";

        for (int i = 0; i < words.length; i++) {
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            String word = words[i].toLowerCase();
            char firstChar = word.charAt(0);

            if (first.indexOf(firstChar) != -1) {
                for (int j = 0; j < word.length(); j++) {
                    if (first.indexOf(word.charAt(j)) != -1) {
                        count1++;
                    }
                }
                if (count1 == word.length()) {
                    list.add(words[i]);
                }
            } else if (second.indexOf(firstChar) != -1) {
                for (int j = 0; j < word.length(); j++) {
                    if (second.indexOf(word.charAt(j)) != -1) {
                        count2++;
                    }
                }
                if (count2 == word.length()) {
                    list.add(words[i]);
                }
            } else {
                for (int j = 0; j < word.length(); j++) {
                    if (third.indexOf(word.charAt(j)) != -1) {
                        count3++;
                    }
                }
                if (count3 == word.length()) {
                    list.add(words[i]);
                }
            }
        }
        return list.toArray(new String[0]);
    }
}