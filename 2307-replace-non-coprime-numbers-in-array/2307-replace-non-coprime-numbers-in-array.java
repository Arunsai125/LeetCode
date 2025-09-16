class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(!list.isEmpty() && gcd(list.get(list.size()-1), num) > 1){
                int val = list.remove(list.size()-1);
                int lcm = findLCM(val, num);
                list.add(lcm);
            }
            else list.add(num);
        }
    return list;
    }
    public int gcd(int a, int b){
        while(a!=b){
            if(a>b) a = a-b;
            else b = b-a;
        }
    return a;
    }
    public int findLCM(int a, int b){
         return (int) ((long) a * b / gcd(a, b)); 
    }
}