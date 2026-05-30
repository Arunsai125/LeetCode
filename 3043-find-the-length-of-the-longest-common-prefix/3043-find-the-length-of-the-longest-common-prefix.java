class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<String> set = new HashSet<>();
        int ans=0;
        for(int num : arr1){
            addAllPrefixes(num, set);
        }
        for(int num : arr2){
            StringBuilder sb = new StringBuilder();
            String str = String.valueOf(num);
            for(int i=0;i<str.length();i++){
                sb.append(str.charAt(i));
                String temp = sb.toString();
                if(set.contains(temp)) ans = Math.max(ans, temp.length());
            }
        }
    return ans;
    }
    public void addAllPrefixes(int num, Set<String> set){
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(num);
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            set.add(sb.toString());
        }
    }
}