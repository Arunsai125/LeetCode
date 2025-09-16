class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(!list.isEmpty() && gcd(list.get(list.size()-1), num) > 1){
                int lcm = findLCM(list.get(list.size()-1), num);
                list.remove(list.get(list.size()-1));
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
        return a*b / gcd(a,b);
    }
}