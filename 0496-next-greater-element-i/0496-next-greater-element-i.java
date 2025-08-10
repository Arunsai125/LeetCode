class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int n = nums2.length;
        int[] temp = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]) st.pop();
            if(st.isEmpty()) temp[i] = -1;
            else temp[i] = st.peek();
        st.push(nums2[i]);
        }
        int[] hashArray = new int[10001];
        for(int i=0;i<n;i++){
            hashArray[nums2[i]] = temp[i];
        }
        for(int i=0;i<ans.length;i++) ans[i] = hashArray[nums1[i]];
    return ans;
    }
}