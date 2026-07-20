class Solution {
    public int findGCD(int[] nums) {
        int smallest = 1001;
        int largest = 0;
        for(int i : nums){
            smallest = Math.min(smallest, i);
            largest = Math.max(largest, i);
        }
    return findGCD(smallest, largest);
    }
    public int findGCD(int num1, int num2){
        if(num2==0) return num1;
    return findGCD(num2, num1%num2);
    }
}