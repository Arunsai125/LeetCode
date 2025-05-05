class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i=1;
        while(i<arr.length-1){
            if(arr[i]%2==0) i+=2;
            else{
                if(arr[i-1]%2==1 && arr[i+1]%2==1) return true;
                else i++;
            }
        }
    return false;
    }
}