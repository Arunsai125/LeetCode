class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i+=2*k){
            int start=i;
            int end = Math.min(start+k-1,s.length()-1);
            reverse(arr,start,end);
        }
    return new String(arr);
    }
    public void reverse(char[] arr, int start, int end){
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}