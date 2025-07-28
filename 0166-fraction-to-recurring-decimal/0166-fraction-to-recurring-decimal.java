class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder ans = new StringBuilder();
        boolean isNegative = ( (numerator>0 && denominator<0) || (numerator<0 && denominator>0) ) ? true : false;
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        long q = num/den;
        ans.append(q);
        long rem = num%den;
        if(rem==0){
            if(isNegative) ans.insert(0, "-");
        return ans.toString();
        }
        else{
            ans.append(".");
            Map<Long,Integer> map = new HashMap<>();
            while(rem!=0){
                if(map.containsKey(rem)){
                    int index = map.get(rem);
                    ans.insert(index, "(");
                    ans.append(")");
                    break;
                }
                else{
                    map.put(rem, ans.length());
                    rem = rem*10;
                    q = rem/den;
                    ans.append(q);
                    rem = rem%den;
                }
            }
        }
         if(isNegative) ans.insert(0, "-");
    return ans.toString();
    }
}