class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while(temp!=null){
            sb.append(temp.val);
            temp = temp.next;
        }
        sb.reverse();
        int pow=0;
        int ans=0;
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch=='1'){
                ans += Math.pow(2,pow);
            }
        pow++; 
        }
    return ans;
    }
}