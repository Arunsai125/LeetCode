class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>();
        for(String num : nums) set.add(num);
        int size = nums[0].length();
        int n = 1 << size;
        for(int i=0;i<=n;i++){
            StringBuilder str = new StringBuilder(Integer.toBinaryString(i));
            int k = str.length();
            if(k != size){
                while(k<size){
                    k++;
                    str.insert(0, "0");
                }
            }
            if(set.contains(str.toString())) continue;
            else return str.toString(); 
        }
    return "";
    }
}