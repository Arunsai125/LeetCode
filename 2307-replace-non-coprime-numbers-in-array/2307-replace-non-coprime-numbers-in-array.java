import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            int val = num;
            while (!ans.isEmpty() && gcd(ans.get(ans.size() - 1), val) > 1) {
                int last = ans.remove(ans.size() - 1);
                val = lcm(last, val);
            }
            ans.add(val);
        }
        return ans;
    }

    public int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        return a == 0 ? b : a;
    }

    public int lcm(int a, int b) {
        return (int) ((long) a * b / gcd(a, b)); 
    }
}
