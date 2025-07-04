class Solution {
    public String robotWithString(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int minChar = 0;

        for (char c : s.toCharArray()) {
            stack.push(c);
            freq[c - 'a']--;

            while (minChar < 26 && freq[minChar] == 0) minChar++;

            while (!stack.isEmpty() && stack.peek() <= ('a' + minChar)) {
                result.append(stack.pop());
            }
        }

        return result.toString();
    }
}